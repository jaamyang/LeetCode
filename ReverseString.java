import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		System.out.println(reverse(s));
	}
	public static String reverse(String s){
		char[] t = new char[s.length()]; 
		for(int i = 0;i < s.length();i++){
			t[i] = s.charAt(s.length()-1-i);
		}
		//System.out.println(t);
		return (new String().valueOf(t));
	}
	
}
