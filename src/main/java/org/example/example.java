package org.example;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;

public class example implements HttpHandler{

    @Override
    public void handle(HttpExchange exchange) throws IOException {
        System.out.println("Salut Mahmood");
    }
}
