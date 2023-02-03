class Solution {
    public String convert(String s, int numRows) {
        if(s.length()<numRows||numRows==1)
            return s;
        String s1[]=new String[numRows];
        for(int i=0;i<s1.length;i++)
        s1[i]="";
        int p=0;
        int d=1;
        for(int i=0;i<s.length();i++){
            s1[p]+=s.charAt(i);
            if(p==numRows-1)
                d=-1;
            else if(p==0)
                d=1;
            p+=d;
        }
        String s2="";
        for(int i=0;i<s1.length;i++){
          s2+=s1[i];
        }
        return s2;
    }
}