public class Employe extends Personne {
    private int numeroEmploye;
    private String dateEmbauche;
  //utilisation de setters et getters
    //nécessaire pour la suite car on emploi "private"

    public Employe(int identifiant, String nom, String adresse, String contact, int numeroEmploye, String dateEmbauche) {
        super(identifiant, nom, adresse, contact);
        this.numeroEmploye = numeroEmploye;
        this.dateEmbauche = dateEmbauche;
    }

    public String obtenirRole() {
        return "Employé Numéro: " + numeroEmploye + ", Date d'embauche: " + dateEmbauche;
    }

    public int getNumeroEmploye() { //recupération de la valeur
        return numeroEmploye;
    }

    public void setNumeroEmploye(int numeroEmploye) {
    	//on affecte une nouvelle valeur à cet attribut
        this.numeroEmploye = numeroEmploye;
    }
    public String getDateEmbauche() {//recupération de la valeur
        return dateEmbauche;
    }

    public void setDateEmbauche(String dateEmbauche) {
    	//on affecte ici aussi une nouvelle valeur à cet attibut
        this.dateEmbauche = dateEmbauche;
    }
}

