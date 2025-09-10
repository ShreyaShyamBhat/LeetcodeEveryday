package Level1;
//643. Maximum Average SubArray I(Easy)(L75)
public class MaxAverageSubArray {
    public static void main(String[] args){
        int[] arr= new int[]{1,12,-5,-6,50,3};
        System.out.println(getMaxSubArray(arr,4));
    }
    public static double getMaxSubArray(int[] arr, int window){
        double sum=0;
        for(int i =0;i<window;i++){
            sum=sum+arr[i];
        }
        double res=sum;
        for(int i=window;i<arr.length;i++){
            sum+=arr[i]-arr[i-window];
            res=Math.max(res,sum);
        }
        return res/window;
    }
}
