
public class arrange_coins {
	public static void main(String[] args){
		System.out.println(new arrange_coins().arrangeConis(18));
	}
	public int arrangeConis(int num){
		return (int)(-1+Math.sqrt((1+8*num)))/2;
	}
}
// ruok????