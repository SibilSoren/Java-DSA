public class MaximumSubarray {
    public static void main(String[] args) {
        int [] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int result = maximumSubarray(arr);
        System.out.println(result);
    }
    public static int maximumSubarray(int[]arr){
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length;i++){
            sum = Math.max(arr[i] + sum , arr[i]);
            maxSum = Math.max(maxSum,sum);
        }
        return maxSum;
    }
}
