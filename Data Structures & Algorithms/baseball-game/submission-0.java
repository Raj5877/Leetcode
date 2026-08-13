class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        for(String operation : operations){
            if(operation.equals("+")){
                int num = stack.pop();
                int num2 = stack.peek();
                stack.push(num);
                stack.push(num+num2);
            }
            else if(operation.equals("D")){
                stack.push(stack.peek()*2);
            }
            else if(operation.equals("C")){
                stack.pop();
            }
            else{
                stack.push(Integer.parseInt(operation));
            }
        }
        int sum=0;
        while(!stack.isEmpty()){
            sum+=stack.pop();
        }
        return sum;
    }
}