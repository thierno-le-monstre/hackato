package cal.info.service;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;

public class ControlleurHackaton implements HttpHandler {
    @Override
    public void handle(HttpExchange exchange) throws IOException {
        System.out.println("Bienvenue dans le controlleur étudiant");
        //prendre le type de requete
        String typeRequete = exchange.getRequestMethod();

        switch (typeRequete){
            case "GET" :
                listeHackathons();
                break;
            case "POST" :
                ajouterHackathon();
                break;
            case "PUT" :
                modifierHackathon();
                break;
            default:
                supprimerHackathon();
        }
    }
    public void listeHackathons(){}
    public void ajouterHackathon(){}
    public void modifierHackathon(){}
    public void supprimerHackathon(){}

}
