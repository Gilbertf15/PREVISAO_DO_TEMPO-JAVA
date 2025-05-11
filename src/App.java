import java.io.IOException;
import  java.net.URI;
import  java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
public class App {
    public static void main(String[] args) throws IOException, Exception, InterruptedException {
        HttpClient cliente1 = HttpClient.newHttpClient();
        
        HttpRequest request1 =  HttpRequest.newBuilder().uri(URI.create("https://api.hgbrasil.com/weather?city_name=São_luis&key=a99754ac")).build();

        HttpResponse<String> resposta1 = cliente1.send(request1, HttpResponse.BodyHandlers.ofString());

        System.out.println("status da resposta:" +  resposta1.statusCode());

        System.out.println("resposta:" +  resposta1.body());

    }
}
