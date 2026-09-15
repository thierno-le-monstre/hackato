import java.time.LocalDate;

public class Hackaton {
    private String nomHackaton;
    private LocalDate dateHackaton;
    private String lieuHackaton;

    public Hackaton(String nomHackaton, String lieuHackaton){
        this.nomHackaton = nomHackaton;
        this.dateHackaton = LocalDate.now();
        this.lieuHackaton = lieuHackaton;
    }
    public String toString(){
        return "Nom Hackaton : "+ this.nomHackaton +", Date : "+this.dateHackaton.toString()+" Lieu : "+this.lieuHackaton;
    }

    public String getNomHackaton() {
        return nomHackaton;
    }

    public LocalDate getDateHackaton() {
        return dateHackaton;
    }

    public String getLieuHackaton() {
        return lieuHackaton;
    }
}
