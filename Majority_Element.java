import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;

public class Majority_Element {
	public int majorityElement(int[] nums) {
	HashMap<Integer,Integer> a = new HashMap<Integer,Integer>();
	int major = 0;
	//int []a = new int[nums.length];
    for(int t:nums){
      if(a.containsKey(t))
    	  a.replace(t, a.get(t)+1);
      else
    	  a.put(t, 1);
      if(a.get(t)>nums.length/2)
    	  major =  t;
    }
   
    return major;
	}
	public static void main(String[]args){
		int []a ={1,2,3,4,5,7,7,7,7,7,7,7,7};
		System.out.println(new Majority_Element().majorityElement(a));
	}
}
