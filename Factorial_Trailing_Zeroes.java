
public class Factorial_Trailing_Zeroes {
	public static void main(String[] args){
		System.out.println(new Factorial_Trailing_Zeroes().trailingZeroes(10));
	}
	
	public int trailingZeroes(int n) {
		int zeronums = 0;
		   while(n>=5)
		   {
		       zeronums+=n/5;
		       n/=5;
		   }
		   return zeronums;
	}
    
}
