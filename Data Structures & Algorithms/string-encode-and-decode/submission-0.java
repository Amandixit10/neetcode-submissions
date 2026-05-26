class Solution {

    public String encode(List<String> strs) {
StringBuffer bf=new StringBuffer();
for(String s:strs)
{
  int len=s.length();
  String ns=len+"/"+s;
  bf.append(ns);
  //System.out.println(bf);
}
return bf.toString();
    }

    public List<String> decode(String str) {
     int i=0;
     List<String> list=new ArrayList<>();
     while(i<str.length())
     {
      int start=i;
      while(str.charAt(i)!='/')
      {
        i++;
      }
      int len=Integer.parseInt(str.substring(start,i));
     // System.out.println(len);
list.add(str.substring(i+1,i+len+1));
i+=len+1;
     }
     return list;
    }
}
