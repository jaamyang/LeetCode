import java.lang.reflect.Method;

public class mainmm {
	public static void main(String[] args) throws Exception{
		Class class1 = Class.forName("Fizzbuzz");
		Method me = class1.getMethod("fizz", int.class);
		me.invoke(null, 15);
	}
}
