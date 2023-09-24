class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        if(s.length()==1){
            return false;
        }

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c=='(' || c=='{' || c=='['){
                stack.push(c);
            }
            if(stack.isEmpty()==true && (c==')' || c=='}' || c==']')){
                return false;
            }
            else{
                if(stack.isEmpty()==false && c==')'){
                    if(stack.peek()=='('){
                        stack.pop();
                    }
                    else if(stack.peek() != '('){
                        return false;
                    }
                }
                else if(stack.isEmpty()==false && c=='}'){
                    if(stack.peek()=='{'){
                        stack.pop();
                    }
                    else if(stack.peek() != '{'){
                        return false;
                    }
                }
                else if(stack.isEmpty()==false && c==']'){
                    if(stack.peek()=='['){
                        stack.pop();
                    }
                    else if(stack.peek() != '['){
                        return false;
                    }
                }
            }
        }
        if(stack.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
}