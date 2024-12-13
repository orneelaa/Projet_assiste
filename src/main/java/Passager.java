import java.util.ArrayList;
import java.util.List;

public class Passager extends Personne{
    private String passeport;
    private List<Reservation> reservations; //liste de toutes les reservations du client

    public Passager(String identifiant, String nom, String adresse, String contact, String passeport) {
        super(identifiant, nom, adresse, contact);
        this.passeport = passeport;
        this.reservations = new ArrayList<>();
    }

    public String getPasseport() {
        return passeport;
    }

    public void setPasseport(String passeport) {
        this.passeport = passeport;
    }

    public String getNom() {
    	return nom;
    }
    
    public List<Reservation> obtenirReservations() {
        return reservations;
    }

    public void reserverVol(Reservation reservation) {
        reservations.add(reservation); // ajoute a la liste une nouvelle reservation
        System.out.println("Réservation ajoutée pour le passager : " + getNom()); //confirmation
    }

    public void annulerReservation(String numeroReservation) {
        reservations.removeIf(reservation -> reservation.getNumeroReservation().equals(numeroReservation)); //supprime la reservation qui correspond au numero
        System.out.println("Réservation " + numeroReservation + " annulée pour le passager : " + getNom());
    }
}