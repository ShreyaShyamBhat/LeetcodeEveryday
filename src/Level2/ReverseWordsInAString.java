package Level2;

import java.util.ArrayList;
import java.util.List;

public class ReverseWordsInAString {
    public static void main(String[] args){
        reverseVowels("The Sky Is Blue");
    }
    public static String reverseVowels(String originalString){
        for(int i =0,j=originalString.length()-1;i<(originalString.length()/2);i++,j--) {
            originalString=String.valueOf(switchPositions(originalString.toCharArray(),j,i));
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
