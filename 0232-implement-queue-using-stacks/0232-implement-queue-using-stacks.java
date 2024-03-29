class MyQueue {
    
    Stack<Integer> s1=new Stack<>();
    Stack<Integer> s2=new Stack<>();
    public MyQueue() {
        
        
    }
    
    public void push(int x) {
        s1.push(x);
    }
    
    public int pop() {
        int n=s1.size();
        for(int i=0;i<n-1;i++)
            s2.push(s1.pop());
        int res=s1.pop();
        for(int i=0;i<n-1;i++)
            s1.push(s2.pop());
        return res;
    }
    
    public int peek() {
        return s1.get(0);
    }
    
    public boolean empty() {
        return s1.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */