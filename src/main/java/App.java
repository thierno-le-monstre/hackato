import cal.info.service.ControlleurEtudiant;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import org.example.example;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

public class App {
    public static void main(String[] args) throws IOException {
        // Création du serveur http qui écoutera sur le port 8000
        HttpServer serveur = HttpServer.create(new InetSocketAddress(8000),0);

        // Première route "/accueil" :
        serveur.createContext("/accueil", new HttpHandler() {
            @Override
            public void handle(HttpExchange echange) throws IOException {
                String response = "Bienvenue sur la page d'accueil !";
                echange.sendResponseHeaders(200, response.length());
                OutputStream os = echange.getResponseBody();
                os.write(response.getBytes());
                os.close();
            }
        });
        serveur.createContext("/chemin/exemple", new example());
        serveur.createContext("/etudiant", new ControlleurEtudiant());

        // Démarrer le serveur
        serveur.setExecutor(null); // Créer un exécuteur par défaut
        serveur.start();

        System.out.println("Serveur démarré et en écoute sur le port 8000");
    }
}
