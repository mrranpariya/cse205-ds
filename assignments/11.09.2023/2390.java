class Solution {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i)=='*'){
                stack.pop();
            }
            else{
                stack.push(s.charAt(i));
            }
        }
        String ans = gets(stack, "");
        
        return ans;
    }
    public static String gets(Stack<Character> stack, String s){
        if(stack.isEmpty()==true){
            return s;
        }
        else{
            char ans = stack.peek();
            stack.pop();
            return gets(stack, ans+s);
        }
    }
}