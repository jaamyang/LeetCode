import java.util.regex.Pattern;

public class Detect_Capital {
	public static void main(String[]args){
		String s = new String("g");
		boolean illeage = true;		
			/*if(Character.isUpperCase(s.charAt(0))){
				if(Character.isUpperCase(s.charAt(1))){
					for(int i =2;i < s.length();i ++){
						if(!Character.isUpperCase(s.charAt(i))){
							illeage = false;
							break;
						}
					}
				}
				else{
					for(int i =2;i < s.length();i ++){
						if(!Character.isLowerCase(s.charAt(i))){
							illeage = false;
							break;
						}
					}
				}
			}	
			else{
				for(int j = 1;j<s.length();j ++){
					if(!Character.isLowerCase(s.charAt(j))){
						illeage = false;
						break;
					}
				}
			}*/
		illeage = s.matches("[A-Z]+|[A-Z][a-z]+|[a-z]+");
			System.out.println(illeage);
	}
}
