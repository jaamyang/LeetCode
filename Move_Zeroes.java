import java.util.ArrayList;

public class Move_Zeroes {
	public static void main(String[]args){
		int []nums=null;
		new Move_Zeroes().moveZeroes(nums);
		for(int a:nums)
		System.out.print(a);
	}
	public void moveZeroes(int[] nums){
		//ArrayList<Integer> ar = new ArrayList<Integer>();
		if(nums == null|| nums.length == 0) return ;
		int j = 0;
		for(int i = 0;i<nums.length;i++){
			if(nums[i] != 0){
				nums[j]=nums[i];
				j++;
			}
		}
		for(int i = j;i<nums.length;i++)
			nums[i] = 0;
    }
}
