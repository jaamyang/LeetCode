
public class Single_Number {
	public int singleNumber(int[] nums) {
        int snum = 0;
        for(int i = 0;i<nums.length;i ++){
            snum ^= nums[i];
        }
        return snum;
    }
}
