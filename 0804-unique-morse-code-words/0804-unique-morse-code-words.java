class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String ch[]= {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        List<String> list=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            String s="";
            for(int j=0;j<words[i].length();j++){
                s+=ch[(int)words[i].charAt(j)-97];
            }
            if(!list.contains(s)){
                list.add(s);
            }
        }
        return list.size();
    }
}