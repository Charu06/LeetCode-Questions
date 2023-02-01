class Solution {
    public String gcdOfStrings(String str1, String str2) {
        int n1=str1.length();
        int n2=str2.length();
        int min=Math.min(n1,n2);
        while(min>0){
            if(n1%min==0&&n2%min==0)
                break;
             min--;
        }
       
        if((str1+str2).equals(str2+str1))
            return str1.substring(0,min);
        else
            return "";
    }
}