class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> a=new ArrayList<>();
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            if(hm.containsKey(nums1[i]))
                hm.put(nums1[i],hm.get(nums1[i])+1);
            else
                hm.put(nums1[i],1);
        }
        for(int i=0;i<nums2.length;i++){
            if(hm.containsKey(nums2[i]) && hm.get(nums2[i])>0){
                a.add(nums2[i]);
                hm.put(nums2[i],hm.get(nums2[i])-1);
            }    
        }
        int ar[]=new int[a.size()];
        for(int i=0;i<ar.length;i++)
            ar[i]=a.get(i);
        return ar;
    }
}