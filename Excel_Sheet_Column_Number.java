
public class Excel_Sheet_Column_Number {
	public int titleToNumber(String s){
		int num = 0;
		for(int i = 0;i<s.length();i++){            
			num += ((int)(s.charAt(i)-64))*Math.pow(26, s.length()-i-1);
        }
		return num;
	}
	public static void main(String []args){
		Excel_Sheet_Column_Number t = new Excel_Sheet_Column_Number();
		System.out.println(t.titleToNumber("AAA"));
	}
}
