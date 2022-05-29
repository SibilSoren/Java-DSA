import java.util.Arrays;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,1,1,3,3,4,3,2,4,2};
        boolean result = containsDuplicate(arr);
        System.out.println(result);
    }

    public  static  boolean containsDuplicate(int[] nums){
        boolean result = false;
        Arrays.sort(nums);
        for(int i = 0;i<nums.length;i++){
            if( i == nums.length -1 ) return false;

            if(nums[i] ==nums[i+1]){
                result = true;
                break;
            }
        }
        return result;
    }
}
