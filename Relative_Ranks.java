import java.util.*;
public class Relative_Ranks {
	public static String[] findRelativeRanks(int[] nums) {
		if(nums==null) return null;
		Integer []temp = new Integer[nums.length];
		int ti = 0;
		for(int a:nums){temp[ti]=a;ti++;}
        List <Integer>lt = Arrays.asList(temp);
		Arrays.sort(nums);
        String []Ranks  = new String[nums.length];
        Ranks[lt.indexOf(nums[nums.length-1])] = "Gold Medal";
        lt.set(lt.indexOf(nums[nums.length-1]), -1);
        int ranktemp = 1;
        for(int i = nums.length-2;i>=0;i--){
        	if(nums[i]!=nums[i+1]) ranktemp++;
        	int location = lt.indexOf(nums[i]);
        	//if(nums[i]!=nums[i-1]) ranktemp++;
        	if(ranktemp == 1){
        		Ranks[location]="Gold Medal";
        		//lt.set(location, -1);
        	}
        	else if(ranktemp == 2){
        		Ranks[location]="Silver Medal";
        		//lt.set(location, -1);
        	}
        	else if(ranktemp == 3){
        		Ranks[location]="Bronze Medal";
        		//lt.set(location, -1);
        	}
        	else{
        		Ranks[location]=Integer.toString(ranktemp);
        	}
        	lt.set(location, -1);		
        }
        return Ranks;
        
    }
	
	
	
	public static void main(String[]args){
		int []nums = {9,8,7,6,5,4,3,8,7,6,5,4,9,8,7,6,5,4,3,2,1};
		/*Integer []temp = new Integer[nums.length];
		int ti = 0;
		for(int a:nums){temp[ti]=a;ti++;}
        List <Integer>lt = Arrays.asList(temp);*/
		//Arrays.sort(nums);
		//int [][]temp = new Relative_Ranks().findRelativeRanks(nums);
		for(String s:findRelativeRanks(nums)){
		System.out.println(s);
		}
       /* for(int s:lt){
    		System.out.println(s);
        }*/
	}
}
