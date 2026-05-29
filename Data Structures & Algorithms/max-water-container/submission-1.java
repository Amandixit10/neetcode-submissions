class Solution {
    public int maxArea(int[] heights) {
       // max water--> max area --> l*b
       int max=-1;
       int n=heights.length;
       for(int i=0;i<n;i++)
       {
int lmax=0;
for(int j=i+1;j<n;j++)
{
lmax=Math.max(lmax,Math.min(heights[i],heights[j])*(j-i));
}
max=Math.max(max,lmax);
       } 
       return max;
    }
}
