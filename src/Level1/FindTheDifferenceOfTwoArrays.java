package Level1;

import java.util.*;
//2215. Find the Difference of Two Arrays

public class FindTheDifferenceOfTwoArrays {
    public static void main(String[] args){
       System.out.println(findDifference(new int[]{1,2,3,3},new int[]{1,1,2,2}));
    }
    public static List<List<Integer>> findDifference(int[] arr1, int[] arr2) {
        return Arrays.asList(getUniqueElements(arr1,arr2),getUniqueElements(arr2,arr1));
    }
    public static List<Integer> getUniqueElements(int[] arr1, int[] arr2){
        Set<Integer> uniqueElementsSet= new HashSet<>();
        HashSet<Integer> arr= new HashSet<>();
        for(int i:arr2){
            arr.add(i);
        }
        for (int i:arr1){
            if(!arr.contains(i)){
                uniqueElementsSet.add(i);
            }
        }
        return new ArrayList<>(uniqueElementsSet);
    }
}
