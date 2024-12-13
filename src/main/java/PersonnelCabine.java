import java.util.ArrayList;
import java.util.List;

public class PersonnelCabine extends Employe {
    private String qualification;
    private List<String> volsAffecte; //liste de vols d'un pilote particulier

    public PersonnelCabine(String identifiant, String nom, String adresse, String contact, String numeroEmploye, String dateEmbauche, String qualification) {
        super(identifiant, nom, adresse, contact, numeroEmploye, dateEmbauche);
        this.qualification = qualification;
        this.volsAffecte = new ArrayList<>();   

    }
    
    public String getNom() {
    	return nom;
    }
    

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
    
    //fonctions idem pilote
    public void affecterVol(String numeroVol) {
        volsAffecte.add(numeroVol);
        System.out.println("Le personnel cabine " + getNom() + " est affecté au vol " + numeroVol);
    }
    
    public void obtenirVol(String numeroVol){
        if (volsAffecte.contains(numeroVol)){
            System.out.println("Le personnel cabine " + getNom() + " est affecté au vol : " + numeroVol);
        } 
        else {
            System.out.println("Le personnel cabine " + getNom() + " n'est pas affecté au vol : " + numeroVol);
        }
    }
    
}