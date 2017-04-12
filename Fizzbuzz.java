import java.util.ArrayList;

public class Fizzbuzz {
	public static void main(String[] args){
		System.out.println(fizz(15));
	}
	
	public static String fizz(int a){
		ArrayList <String> s = new ArrayList<String>();
		for(int i = 1;i <= a;i++){
			if(i%3 == 0 && i%5 == 0)
				s.add("FizzBuzz");
			else if(i%3 == 0 && i%5 !=0)
				s.add("Fizz");
			else if(i%5 == 0 && i%3 !=0)
				s.add("Buzz");
			else 
				s.add(String.valueOf(i));	
		}
		System.out.println(s);
		return s.toString();
	}
}
