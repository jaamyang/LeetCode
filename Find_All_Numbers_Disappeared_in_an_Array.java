import java.util.ArrayList;
import java.util.List;

public class Find_All_Numbers_Disappeared_in_an_Array {
	public static void main(String[] args){
		int []nums = {1,2,3,4,5,6,8,7,4,5,6,3,2,1,4,5,6,3,2,1,4,5,6,8,7,4,5,6,3,2,1};
		System.out.println(findDisappearedNumbers(nums));
		
	}
	
	 public static List<Integer> findDisappearedNumbers(int[] nums) {
	        ArrayList <Integer>list = new ArrayList<Integer>();
	        /*for(int j = 1;j <= nums.length;j++){
	        	list.add(j);
	        }
	        for(int i = 0;i < nums.length;i++){
	            list.remove((Object)nums[i]);
	        }
	        return list;*/
	        for(int i = 0;i<nums.length;i++){
	            int flag=Math.abs(nums[i])-1;
	            if(nums[flag] > 0)
	                nums[flag] = -nums[flag];
	        }
	        for(int i = 0;i<nums.length;i++){
	            if(nums[i] > 0) list.add(i+1);
	        }
	        return list;
	    }

}
