class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0;
        int l=sentences.length;
        for(int i=0;i<l;i++){
            int c=0;
            String s=sentences[i];
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)==' ')
                    c++;
            }
            c++;
            if(c>max)
                max=c;
        }
        return max;
    }
}