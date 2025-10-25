package Level2;
//334. Increasing Triplet Subsequence(Medium)(L75)

public class IncreasingTripletSubsequence {
    public static void main(String[] args){
        int[] nums= new int[]{0,4,2,1,0,-1,-3};
        increasingTriplet(nums);
    }
    public static boolean increasingTriplet(int[] nums) {
        if(nums.length<=2){
            return false;
        }
        int first= Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for(int n : nums){
            if(n<=first){
                first=n;
            }else if(n<=second){
                second=n;
            }else {
                System.out.println("true");
                return true;
            }
        }
        System.out.println("false");
        return false;
    }

}
