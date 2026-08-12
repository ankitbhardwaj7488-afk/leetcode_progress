class MyStack {
    Queue<Integer> Queue= new LinkedList<>();

    public MyStack() {
        
    }
    
    public void push(int x) {
            Queue.offer(x);
            int size = Queue.size();

            for(int i=0;i<size-1 ;i++){
                Queue.offer(Queue.poll());
            }
        
    }
    
    public int pop() {
        
        return Queue.poll();
    }
    
    public int top() {
        return Queue.peek();
    }
    
    public boolean empty() {
        return Queue.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */