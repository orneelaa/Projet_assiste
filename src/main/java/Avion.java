public class Avion {
    private String immatriculation;
    private String modele;
    private int capacite;

    // on initialise un avion
    public Avion(String immatriculation, String modele, int capacite) {
        this.immatriculation = immatriculation;
        this.modele = modele;
        this.capacite = capacite;
    }

    //on cherche à verifier la disponibilité d'un avion, cela serait
    //realiste pour un cas réel
    public boolean verifierDisponibilite() {
        // Pour cet exemple, on suppose que 
    	//l'avion est toujours disponible pour ne pas utiliser
    	//d'autres attributs que ceux du diagramme
        System.out.println("Vérification de la disponibilité de l'avion " + immatriculation);
        return true;  // Retourne toujours vrai (avion toujours 
        //disponible dans notre cas)
    }

    public void affecterVol() {
        if (verifierDisponibilite()) {
            // Si l'avion est disponible, on l'affecte au vol
            System.out.println("Vol affecté à l'avion " + immatriculation + " (" + modele + "), capacité: " + capacite);
            // Une fois affecté, on suppose que l'avion 
            //n'est plus disponible pour cet exemple 
        } 
        else {
            // Si l'avion n'est pas disponible
            System.out.println("L'avion " + immatriculation + " n'est pas disponible pour ce vol.");
        }
    }

    // Getter et Setter si besoin pour chaque attribut
    public String getImmatriculation() {
        return immatriculation;
    }

    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }
}

