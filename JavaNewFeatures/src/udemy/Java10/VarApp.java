package udemy.Java10;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

public class VarApp {

	public static void main(String[] args) {
		beforJava10();
		afterJava10();

	}

	private static void beforJava10() {
		String firstName = "Java";
		String lastName = "FastForward";
		Date dateOfBirth = new Date();
		int salary = 50000;
		URL url;
		try {
			url = new URL("http://javafastforward.com/");
			URLConnection urlconnection = url.openConnection();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(salary + firstName + lastName);
		
	}

	private static void afterJava10() {
		var firstName = "Java";
		var lastName = "FastForward";
		var dateOfBirth = new Date();
		var salary = 50000;
		URL url;
		try {
			url = new URL("http://javafastforward.com/");
			var urlconnection = url.openConnection();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(salary + salary+ firstName + lastName);
	}

}
