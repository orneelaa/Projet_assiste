import java.util.ArrayList;
import java.util.List;

public class Pilote extends Employe {
    private String licence;
    private int heuresDeVol;
    private List<String> volsAffecte; //liste de vols d'un pilote particulier
    //constructeur
    public Pilote(String identifiant, String nom, String adresse, String contact, String numeroEmploye, String dateEmbauche, String licence, int heuresDeVol){
        super(identifiant, nom, adresse, contact, numeroEmploye, dateEmbauche);
        this.licence = licence;
        this.heuresDeVol = heuresDeVol;
        this.volsAffecte = new ArrayList<>();    }

    //getter setter
    public String getLicence() {
        return licence;
    }
    
    public void setLicence(String licence) {
        this.licence = licence;
    }

    public int getHeuresDeVol() {
        return heuresDeVol;
    }

    public void setHeuresDeVol(int heuresDeVol) {
        this.heuresDeVol = heuresDeVol;
    }

    public String getNom() {
    	return nom;
    }
    
    
    //fonctions
    public void affecterVol(String numeroVol) {
        volsAffecte.add(numeroVol);
        System.out.println("Le pilote " + getNom() + " est affecté au vol " + numeroVol);
    }

    public void obtenirVol(String numeroVol){
        if (volsAffecte.contains(numeroVol)){
            System.out.println("Le pilote " + getNom() + " est affecté au vol : " + numeroVol +"Heures de vol accumulées : " + heuresDeVol);
        } else {
            System.out.println("Le pilote " + getNom() + " n'est pas affecté au vol : " + numeroVol);
        }
    }
}