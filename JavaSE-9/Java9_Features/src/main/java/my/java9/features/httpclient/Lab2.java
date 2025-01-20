package my.java9.features.httpclient;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;

public class Lab2 {

    public static void main(String[] args) throws Exception {
        HttpClient httpClient = HttpClient.newHttpClient();

        String url="https://www.w3schools.com/";
        HttpRequest req=HttpRequest.newBuilder(new URI(url)).GET().build();

        HttpResponse resp = httpClient.send(req,HttpResponse.BodyHandlers.ofFile(Paths.get("index.html")));

        System.out.println("Status Code:"+resp.statusCode());
        System.out.println("Body:"+resp.body());
        System.out.println("Response Headers Info");
        HttpHeaders header=resp.headers();
        Map<String, List<String>> map=header.map();
        map.forEach((k,v)->System.out.println("\t"+k+":"+v));

        httpClient.close();
    }
}
