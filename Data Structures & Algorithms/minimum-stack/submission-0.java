class MinStack {
    Deque<Integer> stack;
    Deque<Integer> smallBelow;
    public MinStack() {
        stack = new ArrayDeque<>();
        smallBelow = new ArrayDeque<>();
    }
    
    public void push(int val) {
        stack.push(val);
        if(smallBelow.peek()==null || smallBelow.peek()>=val){
            smallBelow.push(val);
        }
        else{
            smallBelow.push(smallBelow.peek());
        }
    }
    
    public void pop() {
        stack.pop();
        smallBelow.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return smallBelow.peek();
    }
}
