public class Sum_of_Two_Integers{
	public int solution(int a,int b){
		if(temp1 == 0)
			return a;
		int temp1 = a^b;
		int temp2 = a&b;
		return solution(temp1,temp2);
	}
}