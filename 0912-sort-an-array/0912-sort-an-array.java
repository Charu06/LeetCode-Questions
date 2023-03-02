class Solution {
    public int[] sortArray(int[] nums) {
        // Bubble Sort
        // for(int i=0;i<nums.length-1;i++){
        //     for(int j=0;j<nums.length-i-1;j++){
        //         if(nums[j]>nums[j+1]){
        //             int temp=nums[j];
        //             nums[j]=nums[j+1];
        //             nums[j+1]=temp;
        //         }
        //     }
        //     for(int k=0;k<nums.length;k++)
        //         System.out.print(nums[k]+" ");
        //     System.out.println();
        // }
        // return nums;
        return merge_sort(nums);
        
    }
    int[] merge_sort(int nums[]){
        if(nums.length<=1)
            return nums;
        
        int m=nums.length/2;
        int left_array[]=new int[m];
        int right_array[]=new int[nums.length-m];
        for(int i=0;i<m;i++)
            left_array[i]=nums[i];
        for(int i=m;i<nums.length;i++)
            right_array[i-m]=nums[i];
        
        merge_sort(left_array);
        merge_sort(right_array);
        
        int l=0,r=0,j=0;
        while(l<left_array.length && r<right_array.length){
            if(left_array[l]<right_array[r])
                nums[j++]=left_array[l++];
            else
                nums[j++]=right_array[r++];
        }
        
        while(l<left_array.length)
            nums[j++]=left_array[l++];
        while(r<right_array.length)
            nums[j++]=right_array[r++];
        
        return nums;
    }
}