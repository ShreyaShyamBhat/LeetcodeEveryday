package Level2;
//238. Product of Array Except Self(Medium)(L75)

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args){
        int[] arr=new int[]{1,2,3,4};
        int[] expected= new int[]{24,12,8,6};

        System.out.println(Arrays.toString(productOfArray(arr)));
        System.out.println(Arrays.toString(expected));
    }
    public static int[] productOfArray(int[] arr){
        int len= arr.length;
        int[] answer= new int[len];
        answer[0]=1;
        if(len>1){
            for(int i=1;i<len;i++){
                answer[i]=answer[i-1]*arr[i-1];
            }
            int right=1;
            for(int i=len-1;i>=0;i--){
                answer[i]=answer[i]*right;
                right=right*arr[i];
            }
        }
        return answer;
    }
}
