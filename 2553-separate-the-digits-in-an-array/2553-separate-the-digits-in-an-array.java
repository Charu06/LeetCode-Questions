class Solution {
    public int[] separateDigits(int[] nums) {
        List<Character> list=new ArrayList<>();
        String s=Arrays.toString(nums);
        System.out.println(s);
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch!=','&&ch!=' '&&ch!='['&&ch!=']')
                list.add(s.charAt(i));
        }
        int res[]=new int[list.size()];
        for(int i=0;i<list.size();i++)
            res[i]=list.get(i)-'0';
        return res;
    }
}