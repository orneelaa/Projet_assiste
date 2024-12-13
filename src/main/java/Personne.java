public class Personne {
	 // on utilise "protected" au lieu de 
    //"private" pour alléger ici les lignes de codes. On utilisera 
    //"private" pour les autres classes pour respecter les consignes 
    //d'encapsulation stricte, bien que "protected" respecte aussi le 
    //principe d'encapsulation. L'utilisation de "private" implique
	//aussi l'utilisation de getters et de setters
    protected int identifiant;
    protected String nom;
    protected String adresse;
    protected String contact;

    public Personne(int identifiant, String nom, String adresse, String contact) {
        this.identifiant = identifiant;
        this.nom = nom;
        this.adresse = adresse;
        this.contact = contact;
    }

    public String obtenirInfos() {
        return "ID: " + identifiant + ", Nom: " + nom + ", Adresse: " + adresse + ", Contact: " + contact;
    }
}
