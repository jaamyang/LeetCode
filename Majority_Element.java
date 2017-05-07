import java.util.ArrayList;
import java.util.Arrays;

public class Majority_Element {
	public int majorityElement(int[] nums) {
	ArrayList<Integer> a = new ArrayList<Integer>();
    for(int t:nums){
        if(a.contains(t))
            a.set(a.indexOf(t),((int)a.get(t))+1);
        else
            a.add(t);
    }
    Integer []temp = new Integer[a.size()]; 
    a.toArray(temp);
    Arrays.sort(temp);
    return temp[a.size()-1];
	}
	public static void main(String[]args){
		int []a ={2,2};
		System.out.println(new Majority_Element().majorityElement(a));
	}
}
