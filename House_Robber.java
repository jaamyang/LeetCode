public class House_Robber{
	public int maxRob(int nums[]){
		int y = 0;
		int n = 0;
		for(int i = 0; i<nums.length;i++){
			int temp = n;
			n = Math.max(y,n);
			y = nums[i] + temp;
		}
		return Math.max(y,n);
	}
}