class Solution {
    public void duplicateZeros(int[] arr) {
        int c=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
                c++;
        }
        int i=arr.length-1, j=arr.length+c-1;
        while(i!=j){
            insert(arr,i,j--);
            if(arr[i]==0)
                insert(arr,i,j--);
            i--;
        }
    }
    public void insert(int a[], int i, int j){
        if(j<a.length)
            a[j]=a[i];
    }
}