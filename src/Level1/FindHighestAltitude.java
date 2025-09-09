package Level1;

public class FindHighestAltitude {
    public static void main(String[] args){
        int[] gain= new int[]{-4,-3,-2,-1,4,3,2};
        System.out.println(largestAltitude(gain));
    }
    public static int largestAltitude(int[] gain){
        int currentGain=0;
        int highestGain=0;
        for(int i=0;i<gain.length;i++){
            currentGain=currentGain+gain[i];
            highestGain=Math.max(highestGain,currentGain);
        }
        return highestGain;
    }
}
