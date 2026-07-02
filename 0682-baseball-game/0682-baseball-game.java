class Solution {
    public int calPoints(String[] s) {
        Stack<Integer> stack = new Stack<>();

       String nums = "0123456789";
        for (String c : s) {

            if (c.equals("C")) 
                stack.pop();
            
            else if (c.equals("D")) 
                stack.push(stack.peek() * 2);
            
            else if(c.equals("+")) {
                int top = stack.pop();
                int val = top + stack.peek();
                stack.push(top);
                stack.push(val);
            }
            else
                stack.push(Integer.parseInt(c));
        }

        int sum = 0;
        while (!stack.isEmpty()) {
            sum += stack.pop();
        }

        return sum;

    }
}