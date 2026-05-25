class Solution {
    public int[] topKFrequent(int[] nums, int k) {
     PriorityQueue<int[]> pq=new PriorityQueue<>(
      (a,b)->b[1]-a[1]
     );
HashMap<Integer,Integer> map=new HashMap<>();
for(int i:nums)
{
  map.put(i,map.getOrDefault(i,0)+1);
}
for(int i:map.keySet())
{
  pq.add(new int[]{i,map.get(i)});
}
int ans[]=new int[k];
int i=0;
while(k>0)
{
  
ans[i++]=pq.remove()[0];
k--;
}
return ans;
    }
}
