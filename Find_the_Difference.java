
public class Find_the_Difference {
	public static void main(String[] args){
		String s = new String("asd");
		String t = new String("asdf");
		System.out.println(find(s,t));
	}
	/*采用异或的方法*/
	public static char find(String s,String t){
		char re ;
		int s_l = s.length(),t_l = t.length();
		if(s_l == 0 )
			return re = t.charAt(0);
		re = s.charAt(0);
		for(int i = 1;i < s_l;i++){
			re ^= s.charAt(i);
		}
		for(int j = 0;j < t_l;j++){
			re ^=t.charAt(j);
		}
		return re;
	}
}
