import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pascals_triangle_II {
	public List<Integer> getRow(int rowIndex) {
        List <Integer> row = new ArrayList<Integer>();
        Integer [] rowtmp = new Integer[rowIndex+1];
        for(int i = 0 ;i<=rowIndex; i++){
        	rowtmp[i] = 1;
        	rowtmp[0] = 1;
        	for(int j = i-1;j > 0; j --){
        		rowtmp[j] += rowtmp[j-1];
        		
        	}
        }
        row = Arrays.asList(rowtmp);
        return row;
    }
	
	public static void main(String[]args){
		System.out.println(new Pascals_triangle_II().getRow(5));
	}
}
