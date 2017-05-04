import java.util.Arrays;
import java.util.Scanner;

public class Two_Sum_II {
	
	    public int[] twoSum(int[] numbers, int target) {
	        int j=-1;
	        int i=-1;
	        for(i =0 ;i < numbers.length; i++){
	            if(target-numbers[i]==numbers[i]){
	                j = Arrays.binarySearch(numbers,i+1,i+2,numbers[i]);
	                if(j >= 0)
	                   break;
	                else
	                	continue;
	            }
	            if((j=Arrays.binarySearch(numbers,target-numbers[i]))>=0)
	                break;
	        }
	        int[]temp = {i+1,j+1};
	        return temp;
	    }
	
	public static void main(String[]args){
		int []numbers = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		System.out.println(Arrays.toString(new Two_Sum_II().twoSum(numbers, 0)));
		
	}
}
