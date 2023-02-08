class Solution {
    public int countPoints(String rings) {
        boolean red[]=new boolean[10];
        boolean green[]=new boolean[10];
        boolean blue[]=new boolean[10];
        int r=0;
        for(int i=0;i<rings.length();i+=2){
            if(rings.charAt(i)=='R')
                red[rings.charAt(i+1)-48]=true;
            if(rings.charAt(i)=='G')
                green[rings.charAt(i+1)-48]=true;
            if(rings.charAt(i)=='B')
                blue[rings.charAt(i+1)-48]=true;
        }
        for(int i=0;i<10;i++){
            if(red[i]&&green[i]&&blue[i])
              r++;
        }
        return r;
    }
}