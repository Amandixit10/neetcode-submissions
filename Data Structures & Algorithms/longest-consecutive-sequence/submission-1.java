class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        if(n==0)
        {
            return 0;
        }
        Arrays.sort(nums);
        int i=1;
        int ans=1;
        int max=1;
        while(i<n)
        {
if((nums[i]-nums[i-1])>1)
{
  //  System.out.println(nums[i]+" "+max);
    ans=Math.max(max,ans);
    max=1;
}
else if((nums[i]-nums[i-1])==1)
{
    max++;
}
i++;
        }
        ans=Math.max(max,ans);
        return ans;
    }
}
