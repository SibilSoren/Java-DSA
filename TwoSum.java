import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = {3,2,4};
        int target = 6;
        int[] result = twoSum1(nums,target);
        System.out.println(Arrays.toString(result));
    }
    public static int[] twoSum(int[]nums,int target){
        int[] result = new int[2];
        for(int i = 0; i< nums.length;i++){
            for(int j = i + 1; j < nums.length;j++ ){
                if(nums[i]+nums[j] == target){
                    result[0] = i;
                    result[1] = j;

                    break;
                }
            }
        }
        return result;
    }

    public static int[] twoSum1(int[]nums,int target){
        int[] result = new int[2];
        for(int i = 0; i< nums.length;i++){
            int diff = target - nums[i];
            for(int j = 0;j<nums.length;j++){
               if(j!=i){
                   if(diff == nums[j]){
                       result[0]=i;
                       result[1]=j;
                       break;
                   }
               }
            }
        }
        return result;
    }
}
