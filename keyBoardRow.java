import java.util.ArrayList;
import java.util.Scanner;

public class keyBoardRow {

	public static void main(String[] args) {
		String[]t={"Hello","alaska","dad","Peace"};	
		String[] temp=findWords(t);
		for(String a:temp)
		System.out.println(a);
	}
	public static String[] findWords(String[] words) {
        ArrayList<String> strArr=new ArrayList<String>();
        for(String s:words)
        {
            if(s.toLowerCase().matches("[qwertyuiop]+|[asdfghjkl]+|[zxcvbnm]+"))
                strArr.add(s);
        }
        String[] t=new String[strArr.size()];
        strArr.toArray(t);
        return t;
        
    }

}
