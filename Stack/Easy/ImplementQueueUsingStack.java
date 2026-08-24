class MyQueue {

    Deque<Integer> stk1;
    Deque<Integer> stk2;

    public MyQueue() {
        stk1 = new ArrayDeque<>();
        stk2 = new ArrayDeque<>();
    }
    
    public void push(int x) {
        
        while( !stk1.isEmpty() ){
            stk2.push( stk1.pop());
        }
        stk1.push(x);
        while( !stk2.isEmpty() ){
            stk1.push( stk2.pop());
        }
    }
    
    public int pop() {
        
        if( !stk1.isEmpty()){
            return stk1.pop();
        }else{
            return -1;
        }
    }
    
    public int peek() {
        
        if( !stk1.isEmpty()){
            return stk1.peek();
        }else{
            return -1;
        }
    }
    
    public boolean empty() {
        return stk1.isEmpty();
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
