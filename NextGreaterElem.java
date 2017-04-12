
public class NextGreaterElem {
	    public static int[] nextGreaterElement(int[] findNums, int[] nums) {
	        int []rnums = new int[findNums.length]; 
	        for(int i = 0; i < findNums.length;i ++){
	            for(int j = 0;j < nums.length; j ++){
	                int t = 0;
	                if(nums[j] == findNums[i]){
	                    for(t = j;t < nums.length; t ++){
	                        if(nums[t] > findNums[i]){
	                            rnums[i] = nums[t];
	                            break;
	                        }
	                        else
	                            rnums[i] = -1;   
	                    }
	                }
	              
	            }
	        }
	        return rnums;
	    }
	    
	    public static void main(String[] args){
	    	int []a = {2,4};
	    	int []b = {1,2,3,4};
	    	for(int c:(nextGreaterElement(a,b)))
	    	 System.out.println(c);
	    }
}

