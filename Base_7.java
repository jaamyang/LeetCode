
public class Base_7 {
	public String convertToBase7(int num) {
        StringBuffer base7 = new StringBuffer();
        if(num>0)
            {   while(num >= 7){
                    base7.append(num%7);
                    num/=7;
                }
                base7.append(num);
            }
        else if(num < 0)
            {
        		num =-num; 
                while(num >=7 ){
                	base7.append(num%7);
                	num/=7;
                }
                base7.append(num);
                base7.append("-");
            }
        else return "0";
        return base7.reverse().toString();
    }
	public static void main(String[]args){
		System.out.println(new Base_7().convertToBase7(0));
	}
}
