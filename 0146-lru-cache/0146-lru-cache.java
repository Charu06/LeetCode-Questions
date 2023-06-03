class Node{
    int key, val;
    Node next, prev;
    public Node(int key1, int val1){
        key=key1;
        val=val1;
    }
}
class LRUCache {
    HashMap<Integer, Node> map=new HashMap<>();
    int capacity;
    Node head, tail;
    public LRUCache(int capacity) {
        this.capacity=capacity;
        head=new Node(0,0);
        tail=new Node(0,0);
        head.next=tail;
        tail.prev=head;
    }
    
    public int get(int key) {
        if(map.containsKey(key)){
            Node node=map.get(key);
            remove(node);
            insert(node);
            return node.val;
        }
        else
            return -1;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node temp=map.get(key);
            remove(temp);
        }
        else if(map.size()==capacity){
            remove(tail.prev);    
        }
        insert(new Node(key,value));
    }
    
    public void insert(Node node){
        map.put(node.key,node);
        Node temp=head.next;
        head.next=node;
        node.prev=head;
        temp.prev=node;
        node.next=temp;
    }
    public void remove(Node node){
        map.remove(node.key);
        node.prev.next=node.next;
        node.next.prev=node.prev;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */