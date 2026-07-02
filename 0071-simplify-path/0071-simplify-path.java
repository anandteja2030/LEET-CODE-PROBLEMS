class Solution {
    public String simplifyPath(String path) {
        

        Stack<String> stack = new Stack<>();

        String res [] =path.split("/");

        for(String s :res){

            if(s.equals("") || s.equals("."))
                continue;
            else if(s.equals("..")){
                if(!stack.isEmpty())
                    stack.pop();
                }
            else
                stack.push(s);
        }

        StringBuilder sb = new StringBuilder();

        for(String s : stack){
            sb.append("/");
            sb.append(s);
        }

        return (sb.length() == 0 ) ? "/" : sb.toString();

    }
}