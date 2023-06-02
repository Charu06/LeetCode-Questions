class ListNode{
    int val[];
    ListNode next;
    public ListNode(int key, int value){
        val=new int[]{key, value};
        next=null;
    }
}
class MyHashMap {
    int size;
    List<ListNode> a;
    public MyHashMap() {
        size=1000;
        a=new ArrayList<>();
        for(int i=0;i<size;i++)
            a.add(null);
    }
    
    public void put(int key, int value) {
        int h=key%size;
        if(a.get(h)==null){
            a.set(h, new ListNode(key, value));
        }
        else{
            ListNode prev=null;
            ListNode cur=a.get(h);
            while(cur!=null){
                if(cur.val[0]==key){
                    cur.val[1]=value;
                    return;
                }
                prev=cur;
                cur=cur.next;     
            }
            prev.next=new ListNode(key, value);
        }
    }
    
    public int get(int key) {
        int h=key%size;
        if(a.get(h)==null)
            return -1;
        else{
            ListNode cur=a.get(h);
            while(cur!=null){
                if(cur.val[0]==key)
                    return cur.val[1];
                cur=cur.next;
            }
            return -1;
        }
    }
    
    public void remove(int key) {
        int h=key%size;
        ListNode cur=a.get(h);
        if(cur==null)
            return;
        else if(cur.val[0]==key){
            a.set(h, cur.next);
            cur.next=null;
        }
        else{
            ListNode prev=null;
            while(cur!=null){
                if(cur.val[0]==key){
                    prev.next=cur.next;
                    return;
                }
                prev=cur;
                cur=cur.next;
            }
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */