package Level1;
//1207. Unique Number of Occurrences(Easy)(L75)\

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
public class UniqueNumberOfOccurrences {
    public static void main(String[] args){
        System.out.println(uniqueOccurrences(new int[]{-3,0}));
    }
    public static boolean uniqueOccurrences(int[] arr){
        HashMap<Integer,Integer> occurrence = new HashMap<>();
        for(int i: arr){
            if(occurrence.containsKey(i)){
                occurrence.put(i,occurrence.get(i)+1);
            }else{
                occurrence.put(i,1);
            }
        }

        /*
        Set<Integer> uniqueValues = new HashSet<>(occurrence.values());
        return uniqueValues.size()==occurrence.size();
        */

        Set<Integer> uniqueValues = new HashSet<>();
        for(int i:occurrence.values()){
            if(uniqueValues.contains(i)){
                return false;
            }else{
                uniqueValues.add(i);
            }
        }
        return true;
    }
}
