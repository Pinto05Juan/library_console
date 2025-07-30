package com.pintojuan.LiterAlura.client;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Client {
    private final HttpClient client;

    public Client() {
        client = HttpClient.newHttpClient();
    }

    public String request(String nameBook) {
        HttpRequest request;
        try {
            request = HttpRequest.newBuilder()
                    .uri(new URI("https://gutendex.com/books?search=" + nameBook))
                    .build();
            try {
                HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
                return  response.body();
            } catch (IOException | InterruptedException e) {
                throw new RuntimeException(e);
            }
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }

    }


}
