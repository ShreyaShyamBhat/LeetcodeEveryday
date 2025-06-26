package Level1;
//https://leetcode.com/problems/merge-strings-alternately/description/
public class MergeStringAlternatively {

    public static void main(String[] args){
        System.out.println(mergeString("AB","DEf"));
    }
    public static String mergeString(String word1, String word2){
        StringBuilder mergedString= new StringBuilder();
        for(int i=0;i<word1.length()||i<word2.length();i++){
            if(i<word1.length()){
                mergedString.append(word1.charAt(i));
            }
            if(i<word2.length()){
                mergedString.append(word2.charAt(i));
            }
        }
        return mergedString.toString();
    }
}
