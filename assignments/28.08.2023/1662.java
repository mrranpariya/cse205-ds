class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s1 = helper1(word1, "", 0);
        String s2 = helper2(word2, "", 0);
        if(s1.equals(s2)){
            return true;
        }
        else{
            return false;
        }
    }
    public String helper1(String[] word1, String s1, int index){
        if(index == word1.length){
            return s1;
        }
        s1 = s1 + word1[index];
        return helper1(word1, s1, index+1);
    }
    public String helper2(String[] word2, String s2, int index){
        if(index == word2.length){
            return s2;
        }
        s2 = s2 + word2[index];
        return helper1(word2, s2, index+1);
    }
}