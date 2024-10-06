class Node{
    Node links[]=new Node[26];
    boolean flag=false;
    boolean containsKey(char ch){
        return links[ch-'a']!=null;
    }
    void put(char ch, Node node){
        links[ch-'a']=node;
    }
    Node get(char ch){
        return links[ch-'a'];
    }
    void setEnd(){
        flag=true;
    }
    boolean isEnd(){
        return flag;
    }
}

class Trie{
    private static Node root;
    Trie(){
        root = new Node();
    }
    
    public static void insert(String word){
        Node node = root;
        for(int i=0;i<word.length();i++){
            char currChar=word.charAt(i);
            if(!node.containsKey(currChar)){
                node.put(currChar, new Node());
            }
            node=node.get(currChar);
        }
        node.setEnd();
    }
    
    public static boolean canSegmentString(String s, int start, int[] memo){
        if(start==s.length())
            return true;
        if(memo[start]!=-1) return memo[start]==1;
        Node node=root;
        for(int i=start;i<s.length();i++){
            char currChar=s.charAt(i);
            if(!node.containsKey(currChar)){
                break; //only changed here
            }
            node=node.get(currChar);
            if(node.isEnd() && canSegmentString(s, i+1, memo)){
                memo[start]=1;
                return true;
            }
        }
        memo[start]=0;
        return false;
    }
}
class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Trie obj=new Trie();
        for(int i=0;i<wordDict.size();i++){
            obj.insert(wordDict.get(i));
        }
        int memo[]=new int[s.length()];
        Arrays.fill(memo, -1);
        return obj.canSegmentString(s, 0, memo);
    }
}