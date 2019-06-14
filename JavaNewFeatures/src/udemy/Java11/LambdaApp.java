package udemy.Java11;

public class LambdaApp {

	public static void main(String[] args) {
		beforeJava11();
		afterJava11();

	}

	private static void beforeJava11() {
		FunctionalInterface add = (a,b) -> a+b;
		
		int sum = add.addTwoNumbers(100, 200);
		System.out.println("beforeJava11 liefert " + sum);
		
	}

	private static void afterJava11() {
		FunctionalInterface add = (final var a,final var b) -> a+b;
		
		int sum = add.addTwoNumbers(100, 200);
		System.out.println("afterJava11 liefert " + sum);
	}
	
	interface FunctionalInterface {
		public int addTwoNumbers(int a, int b);
	}

}
