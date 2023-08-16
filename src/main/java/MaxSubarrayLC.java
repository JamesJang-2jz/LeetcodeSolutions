public class MaxSubarrayLC {

    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int current = 0;

        for (int i = 0; i < nums.length; i++){
            current += nums[i];
            if (current > max){
                max = current;
            }
            if (current < 0){
                current = 0;
            }
        }
        return max;
    }

    public int maxSubArray(int[] nums, String maxFunction){
        int max = Integer.MIN_VALUE;
        int current = 0;
        int n  = nums.length;
        for (int i = 0; i < n; i++) {
            current = Math.max(nums[i], current + nums[i]);
            max = Math.max(current, max);
        }
        return max;
    }
}
