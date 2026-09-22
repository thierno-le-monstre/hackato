package cal.info.service;

import cal.info.modele.Hackaton;

import java.util.List;

public class GestionHackaton {
    private List<Hackaton> listeHackatons;

    public GestionHackaton(List<Hackaton> listeHackatons){
        this.listeHackatons = listeHackatons;
    }

    public GestionHackaton(Hackaton h, List<Hackaton> listeHackatons){
        this.listeHackatons = listeHackatons;
        ajouterHackaton(h);
    }

    public void ajouterHackaton(Hackaton h){
        this.listeHackatons.add(h);
    }


}
