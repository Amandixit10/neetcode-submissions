class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
      int n=strs.length;
        String ar[]=new String[n];
        for(int i=0;i<n;i++)
        {
          char c[]=strs[i].toCharArray();
          Arrays.sort(c);
          ar[i]=Arrays.toString(c);
       //   System.out.println(ar[i]);
        }
        boolean c[]=new boolean[n];
        List<List<String>> ans=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
          if(c[i])
          {
            continue;
          }
          List<String> list=new ArrayList<>();
          list.add(strs[i]);
          c[i]=true;
          for(int j=i+1;j<n;j++)
          {
if(ar[i].equals(ar[j])&&!c[j])
{
  list.add(strs[j]);
  c[j]=true;
}
          }
ans.add(list);
        }
        return ans;
    }
}
