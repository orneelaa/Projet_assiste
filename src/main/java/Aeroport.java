public class Aeroport {
    private String nom;
    private String ville;
    private String description;

    //ici, on initialise notre aeroport avec les attibuts demandés
    public Aeroport(String nom, String ville, String description) {
        this.nom = nom;
        this.ville = ville;
        this.description = description;
    }

    public void affecterVol() {
    	//on affecte un vol à notre aéroport
        System.out.println("Vol affecté à l'aéroport " + nom + " situé à " + ville);
    }

    // On a choisit de créer une méthode pour 
    //afficher les infos de l'aéroport. Cela permet une meilleure 
    //lisibilité et plus de clarté
    public void afficherInfos() {
        System.out.println("Nom de l'Aéroport: " + nom);
        System.out.println("Ville: " + ville);
        System.out.println("Description: " + description);
    }

    //si on a besoin d'afficher ou d'affecter une nouvelle
    //valeur aux attributs, on utilise les getters et les setters
    //pour chacun d'entre eux
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
}

