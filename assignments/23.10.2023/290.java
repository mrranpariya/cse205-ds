import java.util.*;
class Solution {
    public boolean wordPattern(String pat, String s) {
        String [] x = s.split(" ");
        if(pat.length() != x.length){
            return false;
        }
        HashMap<Character,String> map = new HashMap<>(); 
        for(int i = 0; i<pat.length();i++){
            char c = pat.charAt(i);
            boolean containsKey = map.containsKey(c);
            if(map.containsValue(x[i]) && !containsKey){
                return false;
            }if(containsKey && !map.get(c).equals(x[i])){
                return false;
            }else map.put(c,x[i]);
        }
        return true;
    }
}