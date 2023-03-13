class Solution {
    public String reversePrefix(String word, char ch) {
        if(word.indexOf(ch)>=0){
            char ar[]=word.toCharArray();
            int l=0, r=word.indexOf(ch);
            while(l<r){
                char c=ar[l];
                ar[l]=ar[r];
                ar[r]=c;
                l++;
                r--;
            }
            return String.valueOf(ar);
        }
        else
            return word;
    }
}