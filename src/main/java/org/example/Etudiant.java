package org.example;

import java.util.List;

public class Etudiant {
    private String nomEtudiant;
    private int ageEtudiant;
    private double noteEtudiant;
    private List<Hackaton> preferences;

    public Etudiant (String nomEtudiant, int ageEtudiant, double noteEtudiant){
        setNomEtudiant(nomEtudiant);
        setAgeEtudiant(ageEtudiant);
        setNoteEtudiant(noteEtudiant);
    }
    public void setNoteEtudiant(double note){
        if (note < 0 || note >100){
            if (note < 0)
                this.noteEtudiant = 0;
            else
                this.noteEtudiant = 100;
        }
    }
    public void setAgeEtudiant(int ageEtudiant){
        if (ageEtudiant > 0)
            this.ageEtudiant = ageEtudiant;
        else
            this.ageEtudiant = 0;
    }
    public void setNomEtudiant(String nom){
        if (nom.isBlank())
            throw new IllegalArgumentException("Nom de l'étudiant ne peut être vide");
        this.nomEtudiant = nom;
    }
    public String obtenirNom() {
        return nomEtudiant;
    }

    public int obtenirAge() {
        return ageEtudiant;
    }

    public double obtenirNote() {
        return noteEtudiant;
    }
    public void ajouterPreferenceHackaton(Hackaton h){
        preferences.add(h);
    }
    public void afficherPreferences(){
        for(Hackaton hackaton : preferences){
            System.out.println(hackaton);
        }
    }
    public static void main (String[] args){
        Etudiant Alice = new Etudiant("Alice",19, 86);
        Hackaton Ohana = new Hackaton("Ohana","Quebec");
        Hackaton Mokana = new Hackaton("Mokana", "Ontario");
        Alice.ajouterPreferenceHackaton(Ohana);
        Alice.ajouterPreferenceHackaton(Mokana);
        Alice.afficherPreferences();
    }
}
