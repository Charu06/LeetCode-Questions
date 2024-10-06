class Node{
    Node links[] = new Node[26];
    boolean flag=false;
    boolean containsKey(char ch){
        return links[ch-'a']!=null;
    }
    Node get(char ch){
        return links[ch-'a'];
    }
    void put(char ch, Node node){
        links[ch-'a']=node;
    }
    void setEnd(){
        flag=true;
    }
    boolean isEnd(){
        return flag;
    }
}

class Trie{
    public static Node root;
    Trie(){
        root = new Node();
    }
    
    public static void insert(String word){
        Node node=root;
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(!node.containsKey(ch)){
                node.put(ch, new Node());
            }
            node=node.get(ch);
        }
        node.setEnd();
    }
    
    public List<String> helper(String s, int start, List<String> ans, StringBuilder path){
        if(start==s.length()){
            ans.add(path.toString().trim());
            return ans;
        }
        Node node=root;
        int originalLen = path.length();
        for(int i=start;i<s.length();i++){
            char ch=s.charAt(i);
            if(!node.containsKey(ch)){
                break;
            }
            node=node.get(ch);
            path.append(ch);
            if(node.isEnd()){
                path.append(" ");
                helper(s, i+1, ans, path);
                path.deleteCharAt(path.length()-1);
            }
        }
        path.setLength(originalLen);
        return ans;
    }    
}
class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
        Trie trie=new Trie();
        for(int i=0;i<wordDict.size();i++){
            trie.insert(wordDict.get(i));
        }
        List<String> list = new ArrayList<>();
        trie.helper(s, 0, list, new StringBuilder());
        return list;
    }
}