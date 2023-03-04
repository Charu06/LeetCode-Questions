class Solution {
    public String reverseWords(String s) {
        String arr[]=s.split(" ");
        StringBuffer str=new StringBuffer();
        for(int i=0;i<arr.length;i++){
            StringBuffer sb=new StringBuffer(arr[i]);
            sb.reverse();
            str.append(sb);
            str.append(" ");
     }
        return str.toString().trim();
}
}