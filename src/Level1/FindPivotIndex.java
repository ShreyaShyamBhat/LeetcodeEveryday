package Level1;

//right sum = total sum - current index - left sum
public class FindPivotIndex {
    public static void main(String[] args){
        int [] arr = new int[]{1,7,3,6,5,6};
        System.out.println(findIndex(arr));
    }
    public static int findIndex(int[] arr){
        int total=0;
        for(int i : arr){
            total+=i;
        }
        int leftSum =0;
        for(int i=0;i<arr.length;i++){
            if(leftSum==(total-leftSum-arr[i])){
                return i;
            }else{
                leftSum+=arr[i];
            }
        }
        return -1;
    }
}
