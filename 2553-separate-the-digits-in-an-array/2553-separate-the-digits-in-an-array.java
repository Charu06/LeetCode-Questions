class Solution {
    public int[] separateDigits(int[] nums) {
        List<Character> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            String s=Integer.toString(nums[i]);
            for(int j=0;j<s.length();j++){
                list.add(s.charAt(j));
            }
        }
        int res[]=new int[list.size()];
        for(int i=0;i<list.size();i++)
            res[i]=list.get(i)-'0';
        return res;
    }
}