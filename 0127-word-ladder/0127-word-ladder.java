class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        //using bfs
        Set<String> set =new HashSet<>(wordList);
        if(!set.contains(endWord))
            return 0;
        Queue<String> q=new LinkedList<>();
        q.offer(beginWord);
        int level=0;
        while(!q.isEmpty()){
            level+=1;
            int size=q.size();
            while(size-->0){
                String curr=q.poll();
                for(int i=0;i<curr.length();i++){
                    char[] tempArray = curr.toCharArray();
                    for(char ch='a';ch<='z';ch++){
                        tempArray[i] = ch;
                        String temp = new String(tempArray);
                        if(temp.equals(curr))
                            continue;
                        if(temp.equals(endWord))
                            return level+1;
                        if(set.contains(temp)){
                            q.offer(temp);
                            set.remove(temp);
                        }
                    }
                }
            }
        }
        return 0;
    }
}