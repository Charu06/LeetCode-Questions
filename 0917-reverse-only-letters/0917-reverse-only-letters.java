class Solution {
    public String reverseOnlyLetters(String s) {
        int i=0,j=s.length()-1;
        char ch[]=s.toCharArray();
        while(i<j){
            if(!Character.isLetter(ch[i]))
                i++;
            else if(!Character.isLetter(ch[j]))
                j--;
            else{
                char c=ch[i];
                ch[i]=ch[j];
                ch[j]=c;
                i++;
                j--;
            }
        }
        return String.valueOf(ch);
    }
}