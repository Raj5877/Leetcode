class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> stack = new ArrayDeque<Integer>();
        for(int val : asteroids){
            if(stack.isEmpty() || val>=0){
                stack.push(val);
            }
            else{
                boolean explode=false;
                while(!stack.isEmpty() && stack.peek() >= 0){
                    if(Math.abs(stack.peek()) == Math.abs(val)){
                        stack.pop();
                        explode=true;
                        break;
                    }
                    else if(Math.abs(stack.peek()) < Math.abs(val)){
                        stack.pop();
                    }
                    else{
                        explode = true;
                        break;
                    }
                }
                if(!explode){
                    stack.push(val);
                }
            }
        }
        int n = stack.size();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[n-i-1] = stack.pop();
        }
        return arr;
    }
}