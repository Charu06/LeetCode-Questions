class Solution {
    public int[] decode(int[] encoded, int first) {
        int arr[]=new int[encoded.length+1];
        arr[0]=first;
        int c=0;
        for(int i=1;i<encoded.length+1;i++){
            arr[i]=first^encoded[c++];
            first=arr[i];
        }
        return arr;
    }
}