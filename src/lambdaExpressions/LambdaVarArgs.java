package lambdaExpressions;

interface LambdaInterface0{
	public String sing();
}

interface LambdaInterface1{
	public String singAlong(String name);
}

public class LambdaVarArgs {

	public static void main(String[] args) {
		
		LambdaVarArgs varArgs = new LambdaVarArgs();
		LambdaInterface0 lambInt0 = () -> {return "hello";};
		System.out.println(lambInt0.sing());
		
		LambdaInterface1 lambInt1 = name
				-> {return "hello " + name;};
		System.out.println(lambInt1.singAlong("labhesh"));
	}
}
