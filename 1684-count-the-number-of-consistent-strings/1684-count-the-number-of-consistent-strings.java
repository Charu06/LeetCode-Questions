class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int c=0;
        for(int i=0;i<words.length;i++){
            boolean flag=true;
            for(int j=0;j<words[i].length();j++){
                if(allowed.indexOf(words[i].charAt(j))==-1)
                    flag = false;
            }
            if(flag!=false)
                c++;
        }
        return c;
    }
}