class Solution {
    public boolean isAnagram(String s, String t) {
      char a[]=s.toCharArray();
      char b[]=t.toCharArray();
      Arrays.sort(a);
      Arrays.sort(b);
String p=Arrays.toString(a);
String q=Arrays.toString(b);
return p.equals(q);
    }
}
