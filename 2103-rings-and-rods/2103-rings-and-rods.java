class Solution {
    public int countPoints(String rings) {
        String a[]=new String[10];
        for(int i=0;i<10;i++)
            a[i]="";
        for(int i=0;i<rings.length()-1;i+=2){
            a[rings.charAt(i+1)-48]+=rings.charAt(i);
        }
        int r=0;
        for(int i=0;i<10;i++){
            if((a[i].indexOf("B")!=-1)&&(a[i].indexOf("R")!=-1)&&(a[i].indexOf("G")!=-1))
                r++;
        }
        return r;
    }
}