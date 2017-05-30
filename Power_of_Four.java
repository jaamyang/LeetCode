public class Solution {
    public boolean isPowerOfFour(int num) {
        double lg = Math.log(num)/Math.log(2);
        if(lg%2==0) return true;
        else return false; 
    }
}