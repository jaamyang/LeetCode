
public class Construct_the_Rectangle {
	public static void main(String[] args){
		int nums[] = new Construct_the_Rectangle().solution(4);
		System.out.println(nums[0]+" "+nums[1]);
	}
	public int[] solution(int area){		
		int nums[] = new int[2]; 
		if(area == 0)
			return nums;
		double temp = Math.sqrt(area);
		int num = (int)Math.round(temp);
		while(area%num !=0){
			num --;
		}
		int b =area/num;
		nums[0] = b;
		nums[1] = num;
		return nums;
	}
}
