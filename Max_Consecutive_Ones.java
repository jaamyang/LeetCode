
public class Max_Consecutive_Ones {
	public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int t = 0;
        for(int i = 0;i < nums.length;i++){
            if(nums[i] == 1)  {
                t++;
                max = Math.max(t,max);
            }
            else
                t = 0;
        }
        return max;
    }
}
