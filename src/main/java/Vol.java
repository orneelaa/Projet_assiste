import java.util.ArrayList;
import java.util.List;

public class Vol {
    private int numeroVol;
    private String origine;
    private String destination;
    private int dateHeureDepart;
    private int dateHeureArrivee;
    private String etat;
    private List<String> equipage;

    public Vol(int numeroVol, String origine, String destination, int dateHeureDepart, int dateHeureArrivee) {
        this.numeroVol = numeroVol;
        this.origine = origine;
        this.destination = destination;
        this.dateHeureDepart = dateHeureDepart;
        this.dateHeureArrivee = dateHeureArrivee;
        this.etat = "Prévu";
        this.equipage = new ArrayList<>();
    }

    public int getNumeroVol() {
        return numeroVol;
    }

    public void setNumeroVol(int numeroVol) {
        this.numeroVol = numeroVol;
    }

    public String getOrigine() {
        return origine;
    }

    public void setOrigine(String origine) {
        this.origine = origine;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getDateHeureDepart() {
        return dateHeureDepart;
    }

    public void setDateHeureDepart(int dateHeureDepart) {
        this.dateHeureDepart = dateHeureDepart;
    }

    public int getDateHeureArrivee() {
        return dateHeureArrivee;
    }

    public void setDateHeureArrivee(int dateHeureArrivee) {
        this.dateHeureArrivee = dateHeureArrivee;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }



    public static List<Vol> planifierVol(List<Vol> vols, List<Vol> nouveauxVols) {
        vols.addAll(nouveauxVols);
        System.out.println(nouveauxVols.size() + " vols ont été planifiés.");
        return vols;
    }

    public void annulerVol() {
        this.etat = "Annulé";
        System.out.println("Le vol " + numeroVol + " a été annulé.");
    }

    public void modifierVol(String origine, String destination, String dateHeureDepart, String dateHeureArrivee) {
        this.origine = origine;
        this.destination = destination;
        this.dateHeureDepart = dateHeureDepart;
        this.dateHeureArrivee = dateHeureArrivee;
        System.out.println("Le vol " + numeroVol + " a été modifié.");
    }

    public void listingPassager() {
        System.out.println("Liste des passagers pour le vol " + numeroVol + " :");
        for (String passager : passagers) {
            System.out.println("- " + passager);
        }
        }
    }


}