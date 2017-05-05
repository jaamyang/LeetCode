import java.util.Arrays;

public class Assign_Cookies {
	public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int num = 0;
        for(int j = 0;num < g.length&&j<s.length;j ++){
            if(g[num]<=s[j]) num++;
        }
        return num;
    }
}
