class Solution {
    public int maxProfit(int[] prices) {
       int max=-1;
       int n=prices.length;
       int lmin=prices[0];
       for(int i=0;i<n;i++)
       {
     lmin=Math.min(lmin,prices[i]);
     max=Math.max(max,Math.abs(lmin-prices[i]));
       } 
       return max;
    }
}
