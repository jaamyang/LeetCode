public class Solution {
    public int maxSubArray(int[] nums) {
        int []d = new int[nums.length];
        int max = nums[0];
        d[0] = nums[0];
        for(int i = 1;i<=nums.length-1;i++){
            d[i]=Math.max(nums[i],d[i-1]+nums[i]);
            max=Math.max(max,d[i]);
        }
        return max;
    }
}