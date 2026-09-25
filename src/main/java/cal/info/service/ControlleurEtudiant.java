package cal.info.service;

import cal.info.modele.Etudiant;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class ControlleurEtudiant implements HttpHandler {
    @Override
    public void handle(HttpExchange exchange) throws IOException {
        System.out.println("Bienvenue dans le controlleur Étudiant ");
        String typeRequete = exchange.getRequestMethod();
        System.out.println("Requete de type : " + typeRequete);
        switch(typeRequete) {
            case "GET":
                listerEtudiants(exchange);
                break;
            case "POST":
                ajout(exchange);
                break;
            case "PATCH":
                modifierEtudiants(exchange);
                break;
            case "DELETE":
                supprimerEtudiants(exchange);
            break;
            default:
                break;
        }

    }

    public void ajout(HttpExchange exchange) throws IOException {
        // lire le corp
        InputStream fluxEntree = exchange.getRequestBody();

        String corpsRecu = new String(
                fluxEntree.readAllBytes(),
                StandardCharsets.UTF_8
        );

        fluxEntree.close();

        System.out.println("Données reçues du client : " + corpsRecu);
        // des choses
        // ajout en bd

        // Écrire la réponse
        //ÉTAPE 1 : préparer le texte de la réponse
        String response = "Etudiant ajouté avec succès !";
        byte[] octetsReponse = response.getBytes(StandardCharsets.UTF_8);

        // ÉTAPE 2 : envoyer les en-têtes (code 200 = OK, + la longueur du corps)
        exchange.sendResponseHeaders(200, octetsReponse.length);

        // ÉTAPE 3 : écrire le corps dans le tuyau de sortie, puis fermer
        OutputStream fluxSortie = exchange.getResponseBody();
        fluxSortie.write(octetsReponse);
        fluxSortie.close();
    }
    public void listerEtudiants(HttpExchange exchange) throws IOException {
        String response = "Liste Étudiants (à venir)";

        byte[] octetsReponse = response.getBytes(StandardCharsets.UTF_8);

        exchange.sendResponseHeaders(200, octetsReponse.length);

        OutputStream fluxSortie = exchange.getResponseBody();
        fluxSortie.write(octetsReponse);
        fluxSortie.close();

    }
    public void modifierEtudiants(HttpExchange exchange) throws IOException {
        String reponse = "Méthode indisponible pour le moment";

        byte[] octetsReponse = reponse.getBytes(StandardCharsets.UTF_8);

        exchange.sendResponseHeaders(200, octetsReponse.length);

        OutputStream fluxSortie = exchange.getResponseBody();
        fluxSortie.write(octetsReponse);
        fluxSortie.close();

    }
    public void supprimerEtudiants (HttpExchange exchange) throws IOException{
        String response = "Méthode indisponible pour le moment";

        byte[] octetsReponse = response.getBytes(StandardCharsets.UTF_8);

        exchange.sendResponseHeaders(200, octetsReponse.length);

        OutputStream fluxSortie = exchange.getResponseBody();
        fluxSortie.write(octetsReponse);
        fluxSortie.close();
    }
}
