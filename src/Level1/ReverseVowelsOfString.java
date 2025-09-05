package Level1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ReverseVowelsOfString {
    public static void main(String[] args){

        reverseVowels("leetcode");
        //leotcede
    }
    public static String reverseVowels(String originalString){
        List<Integer> vowelsPositions = new ArrayList<>();
        String vowels="AaEeIiOoUu";
        for(int i =0; i<originalString.length(); i++){
            if(vowels.contains(String.valueOf(originalString.charAt(i)))){
                vowelsPositions.add(i);
            }
        }
        for(int i =0,j=vowelsPositions.size()-1;i<(vowelsPositions.size()/2);i++,j--) {
            originalString=String.valueOf(switchPositions(originalString.toCharArray(),vowelsPositions.get(j),vowelsPositions.get(i)));
        }
        System.out.println(originalString);
        return originalString;
    }
    public static char[] switchPositions(char[] toSwap,int a, int b){
        char temp= toSwap[a];
        toSwap[a]=toSwap[b];
        toSwap[b]=temp;
        return toSwap;
    }
}
