class StockSpanner {
    ArrayList<Integer> list;
    Deque<Integer> stack1;
    public StockSpanner() {
        list = new ArrayList<>();
        stack1 = new ArrayDeque<>();
    }
    
    public int next(int price) {
        list.add(price);
        int index = list.size()-1;
        int result;
        if(stack1.isEmpty()){
            stack1.push(index);
            return 1;
        }
        while(!stack1.isEmpty() && list.get(stack1.peek()) <= price){
            stack1.pop();
        }
        if(stack1.isEmpty()) result = index+1;
        else{
            result = index - stack1.peek();
        }
        stack1.push(index);
        return result;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */