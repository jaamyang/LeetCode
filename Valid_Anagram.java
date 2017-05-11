public class Vaild_Anagram {
    public boolean isAnagram(String s, String t) {
        int []a = new int[26];
        for(int i=0;i<s.length();i++){
            a[s.charAt(i)-97]++;
        }
        for(int i=0;i<t.length();i++){
            a[t.charAt(i)-97]--;
        }
        for(int m:a){if(m!=0)return false;}
        return true;
    }
}