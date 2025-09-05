package Level1;

public class IsSubsequence {
    public static void main(String[] args){
        System.out.println(checkSubsequence("abc","ahbgdc"));
    }
    public static boolean checkSubsequence(String s, String t){
        if(s.isEmpty())
            return true;
        int i=0;
       int j=0;
        for(;i<s.length();i++){
            for(;j<t.length();j++){
                if(s.charAt(i)==t.charAt(j)){
                    if(i==s.length()-1){
                        return true;
                    }
                    j++;
                    break;
                }
            }
        }
        return false;
    }
}
