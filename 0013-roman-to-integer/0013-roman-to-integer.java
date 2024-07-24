class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> hm=new HashMap<>();
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);
        int n=s.length();
        int sum=hm.get(s.charAt(0));
        for(int i=1; i<n; i++){
            int n1=hm.get(s.charAt(i-1));
            int n2=hm.get(s.charAt(i));
            if(n1<n2)
                    sum=sum+(n2-(n1*2));
            else
                sum+=n2;
        }
        return sum;
    }
}