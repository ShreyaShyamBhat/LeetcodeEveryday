package Level1;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
* URL: https://leetcode.com/problems/two-sum/
*/
public class TwoSum {
    public static void main(String[] args){
        System.out.println(Arrays.toString(findTwoSum(new int[]{3,3},6)));
        System.out.println(Arrays.toString(findTwoSumBetter(new int[]{3,3},6)));
    }

    /*
    * start a loop with i=0 going through the array.
    * find the delta which is delta= target-numbers[i]
    * check if delta is a part of any existing keys in the hash map
    * and
    * make sure value is not same as index, if false:
    * Add data into hash map such that the key=numbers[i] & value=i;
    * finish the loop.
    * We should have our pair!
    * O(n)! GG.
    * */
    public static int[] findTwoSumBetter(int[] numbers, int target){
        Map<Integer,Integer> hashmap = new HashMap<>();
        for(int i=0;i<numbers.length;i++){
            int delta= target-numbers[i];
            if(hashmap.containsKey(delta) && hashmap.get(delta)!=i){
                return new int[]{hashmap.get(delta),i};
            }else{
                hashmap.put(numbers[i],i);
            }
        }
        return new int[]{};
    }


    /*
    * MY FIRST IMPLEMENTATION #notGreat!
    * loop once,
    * check with the upcoming others,
    * do again with the next number.
    * O(n*n) not great.
    * */
    public static int[] findTwoSum(int[] numbers, int target){
        int[] indices = new int[]{};
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {

                if (numbers[i] + numbers[j] == target) {
                    indices = new int[]{i, j};
                    System.out.println(Arrays.toString(indices));
                    break;
                }
            }
        }
        return indices;
    }
}
