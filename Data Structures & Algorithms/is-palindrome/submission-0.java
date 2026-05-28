class Solution {
    public boolean isPalindrome(String s) {
       String ar[]=s.split(" ");
       StringBuffer bf=new StringBuffer();
       for(String i:ar)
       {
        bf.append(i);
       } 
       String tst0=bf.toString();
       String tst=tst0.toLowerCase();
       int i=0;
       int j=bf.length()-1;
       while(i<j)
       {
        char a=tst.charAt(i);
        char b=tst.charAt(j);
        if(!Character.isLetterOrDigit(a))
        {
i++;
        }
        else if(!Character.isLetterOrDigit(b))
        {
            j--;
        }
else if(a!=b)
{
    System.out.print(tst.charAt(i)+" "+tst.charAt(j));
    return false;
}
else{
i++;
j--;
}
       }
       return true;
    }
}
