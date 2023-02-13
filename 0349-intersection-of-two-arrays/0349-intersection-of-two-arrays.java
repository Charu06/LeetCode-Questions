class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs1=new HashSet<>();
        for(int i=0;i<nums1.length;i++)
            hs1.add(nums1[i]);
        HashSet<Integer> hs2=new HashSet<>();
        for(int i:nums2){
            if(hs1.contains(i))
                hs2.add(i);
        }
        int a[]=new int[hs2.size()];
        int i=0;
        for(int c : hs2)
            a[i++]=c;
        return a;
    }
}