class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Deque<Integer> stack = new ArrayDeque<>();
        int[] result = new int[temperatures.length];
        for(int i=0;i<temperatures.length;i++){
            if(stack.isEmpty()){
                stack.push(i);
            }
            else{
                while(!stack.isEmpty() && temperatures[stack.peek()]<temperatures[i]){
                    int j = stack.pop();
                    result[j] = i-j;
                }
                stack.push(i);
            }
        }
        return result;
    }
}