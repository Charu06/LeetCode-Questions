class Solution {
    public String defangIPaddr(String address) {
        String s1="";
        int l=address.length();
        for(int i=0;i<l;i++){
            if(address.charAt(i)=='.')
                s1+="[.]";
            else
                s1+=address.charAt(i);
        }
        return s1;
    }
}