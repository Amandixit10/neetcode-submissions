class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        // i can binary search on the remaining sum.
// there have to be no duplicacy = maintain hashset
List<List<Integer>> ans=new ArrayList<>();
HashSet<Integer> set=new HashSet<>();
int suf[]=new int[n];
suf[n-1]=nums[n-1];
for(int i=n-2;i>=0;i--)
{
 suf[i]=nums[i]+nums[i+1];
}
for(int i=0;i<n-2;i++)      
{
    if(set.contains(nums[i]))
    {
        continue;
    }
    HashSet<Integer> set2=new HashSet<>();
    for(int j=i+1;j<n-1;j++)
    {
        if(set2.contains(nums[j]))
        {continue;}
        int rem=nums[i]+nums[j];
        rem*=-1;
        int idx=bs(j,rem,nums);
        if(idx!=-1)
        {
            set.add(nums[i]);
            set2.add(nums[j]);
            List<Integer> list=new ArrayList<>();
             list.add(nums[i]);
             list.add(nums[j]);
             list.add(nums[idx]);
             ans.add(list);
        }
    }
}
return ans;
    }
    int bs(int start, int sum, int nums[])
{
    int lo = start;
    int hi = nums.length;

    while(hi - lo > 1)
    {
        int mid = lo + (hi - lo) / 2;

        if(nums[mid] <= sum)
        {
            lo = mid;
        }
        else{
            hi = mid;
        }
    }

    return (lo > start && nums[lo] == sum) ? lo : -1;
}
}
