class Solution {
    public int[] twoSum(int[] nums, int sum) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
          int tar=sum-nums[i];
          if(map.containsKey(tar))
          {
            return new int[]{map.get(tar),i};
          }
          map.put(nums[i],i);
        }
        return new int[0];
    }
}
