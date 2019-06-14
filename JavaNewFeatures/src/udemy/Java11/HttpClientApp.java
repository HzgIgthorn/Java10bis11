package udemy.Java11;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpClientApp {

	public static void main(String[] args) {
		String url = "https://www.google.com/";
		HttpClient httpClient = HttpClient.newHttpClient();
		try {
			HttpRequest httpRequest = HttpRequest.newBuilder(new URI(url)).GET().build();
			HttpResponse httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
			System.out.println("Request: " + httpRequest);
			System.out.println("Response from server: \n" + httpResponse.body());
		}catch(IOException | InterruptedException | URISyntaxException e) {
			e.printStackTrace();
		}

	}

}
