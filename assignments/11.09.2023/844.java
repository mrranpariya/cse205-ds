class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stacks = new Stack<>();
        Stack<Character> stackt = new Stack<>();
        int count1 = 0;
        int count2 = 0;

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='#' && stacks.isEmpty()==true){
                continue;
            }
            else if(s.charAt(i)=='#'){
                stacks.pop();
            }
            else{
                stacks.push(s.charAt(i));
            }
        }
        for(int i=0; i<t.length(); i++){
            if(t.charAt(i)=='#' && stackt.isEmpty()==true){
                continue;
            }
            else if(t.charAt(i)=='#'){
                stackt.pop();
            }
            else{
                stackt.push(t.charAt(i));
            }
        }

        
        return compare(stacks, stackt);
    }
    public static boolean compare(Stack<Character> stacks, Stack<Character> stackt){
        if(stacks.size() != stackt.size()){
            return false;
        }
        while(!stacks.isEmpty() && !stackt.isEmpty()){
            if(stacks.peek() != stackt.peek()){
                return false;
            }else{
                stacks.pop();
                stackt.pop();
            }
        }
        return true;
    }
}