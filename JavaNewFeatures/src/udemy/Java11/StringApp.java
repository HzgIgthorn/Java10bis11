package udemy.Java11;

public class StringApp {
	
	private static final int COUNT = 10;

	public static void main(String[] args) {
		beforeJava11();
		afterJava11();

	}

	private static void beforeJava11() {
		System.out.println("Before Java 11");
		var javaVersion = "Java11";
		for(var i = 0; i < COUNT; i++) {
			System.out.print(javaVersion);
		}
		System.out.println();
		
		var str = "";
		if(str.isEmpty())
			System.out.println("String str is blank");
		else
			System.out.println("String str is not blank");
		
		str = " ";
		if(str.isEmpty())
			System.out.println("String str is blank");
		else
			System.out.println("String str is not blank");
		
		str = "Java11\nJava10\nJava9\nJava8";
		var lines = str.split("\\n");
		for(var s : lines) {
			System.out.println(s);
		}
		
		str = " Java 11 ";
		System.out.println(str.trim());
		System.out.println(str.replaceAll("^\\s+", ""));
		System.out.println(str.replaceAll("\\s+$", ""));
		
	}

	private static void afterJava11() {
		System.out.println("From Java 11");
		var javaVersion = "Java11";
		System.out.println(javaVersion.repeat(COUNT));
		
		var str = "";
		if(str.isBlank())
			System.out.println("String str is blank");
		else
			System.out.println("String str is not blank");
		
		str = " ";
		if(str.isBlank())
			System.out.println("String str is blank");
		else
			System.out.println("String str is not blank");
		
		str = "Java11\nJava10\nJava9\nJava8";
		str.lines().forEach(System.out::println);
		
		str = " Java 11 ";
		System.out.println(str.strip());
		System.out.println(str.stripTrailing());
		System.out.println(str.stripLeading());
	}

}
