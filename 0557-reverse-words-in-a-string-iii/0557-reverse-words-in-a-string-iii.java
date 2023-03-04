class Solution {
    public String reverseWords(String s) {
        String arr[]=s.split(" ");
        String str="";
        for(int i=0;i<arr.length;i++){
            StringBuffer sb=new StringBuffer(arr[i]);
            sb.reverse();
            str+=sb.toString()+" ";
     }
        return str.trim();
}
}