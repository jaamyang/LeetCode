
public class Reverse_Words_in_a_String_III {
	public String reverseWords(String s) {
        StringBuffer tempsb  ;
        StringBuffer sb = new StringBuffer();
        int head = 0,tail = 0;
        for(int i = 0;i < s.length();i++){
            if(s.charAt(i)==' '||i == s.length()-1){
            	tail= i == s.length()-1?i+1:i;
                tempsb = new StringBuffer((s.substring(head, tail)));
                tempsb.reverse();
                sb.append(tempsb);
                head = tail + 1;
                if(i<s.length()-1)
                	sb.append(" ");   
            }            
        }
        return sb.toString();
    }
	public static void main(String[]args){
		System.out.println(new Reverse_Words_in_a_String_III().reverseWords("Let's take LeetCode contest"));
	}
}
