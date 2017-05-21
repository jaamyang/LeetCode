import java.util.ArrayList;
import java.util.List;

public class Pascals_Triangle {
	public static void main(String[] args){
		System.out.println(new Pascals_Triangle().generate(0));
	}
	public List<List<Integer>> generate(int numRows){
		List<List<Integer>> al = new ArrayList<List<Integer>>();
		for(int i=0;i<numRows;i++){
			List<Integer> t = new ArrayList<Integer>();
			if(i == 0)
				t.add(1);
			if(i == 1){
				t.add(1);
				t.add(1);
			}
			if(i > 1){
				for(int j = 0;j<=i;j++){
					if(j==0||j==i)
						t.add(1);
					else
						t.add(al.get(i-1).get(j)+al.get(i-1).get(j-1));
				}
			}
			al.add(t);
		}
		return al;
	}
}
