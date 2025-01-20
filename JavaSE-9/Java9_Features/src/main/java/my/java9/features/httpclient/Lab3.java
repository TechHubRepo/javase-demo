package my.java9.features.httpclient;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class Lab3 {

    public static void main(String[] args) throws Exception {
        HttpClient httpClient = HttpClient.newHttpClient();

        String url="https://www.w3schools.com/";
        HttpRequest req=HttpRequest.newBuilder(new URI(url)).GET().build();

        System.out.println("Sending request ...");

        CompletableFuture<HttpResponse<String>> cf = httpClient.sendAsync(req, HttpResponse.BodyHandlers.ofString());

        System.out.println("Waiting for Response");
        HttpResponse<String> resp  = cf.join();

        System.out.println("Status Code:"+resp.statusCode());
        System.out.println("Body:"+resp.body());
        System.out.println("Response Headers Info");
        HttpHeaders header=resp.headers();
        Map<String, List<String>> map=header.map();
        map.forEach((k,v)->System.out.println("\t"+k+":"+v));

        httpClient.close();
    }
}
