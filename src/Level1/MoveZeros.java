package Level1;
//283. Move Zeroes(Easy)(L75)
import java.util.Arrays;
public class MoveZeros {
    public static void main(String[] args){
        int [] nums= new int[]{0,1,0,2,0,3};
        move(nums);
    }
    public static void move(int [] nums){
        System.out.println(Arrays.toString(nums));
        int decrement=0;
        for(int i=0;i<nums.length;i++){
          if(nums[i]==0){
              decrement++;
          }else{
              if(decrement!=0){
                  nums[i-decrement]=nums[i];
                  nums[i]=0;
              }

          }
        }
        System.out.println(Arrays.toString(nums));
    }
}
