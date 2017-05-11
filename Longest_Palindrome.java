
public class Longest_Palindrome {
	public int longestPalindrome(String s) {
        int []a = new int[60];
        int longest = 0;
        boolean flag = false;

        for(int i = 0;i<s.length();i++){
        	a[s.charAt(i)-64] += 1; 
        }
        for(int t:a){
        	if(t != 0)
        	{
        		if(t%2==0)
        			longest+=t;
        		else{
        			longest+=(t/2)*2;
        			flag = true;
        		} 
        			
        	}
        }
        if(flag) return longest+1;
        return longest;
    }
	public static void main(String[] args){
		System.out.println(new Longest_Palindrome().longestPalindrome("zeusnilemacaronimaisanitratetartinasiaminoracamelinsuez"));
	}
}
