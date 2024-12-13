public class Reservation {
    private int numeroReservation;
    private int dateReservation;
    private String statut;

    public Reservation(int numeroReservation, int dateReservation, String statut) {
        this.numeroReservation = numeroReservation;
        this.dateReservation = dateReservation;
        this.statut = statut;
    }

    public int getNumeroReservation() {
        return numeroReservation;
    }

    public void setNumeroReservation(int numeroReservation) {
        this.numeroReservation = numeroReservation;
    }

    public int getDateReservation() {
        return dateReservation;
    }

    public void setDateReservation(int dateReservation) {
        this.dateReservation = dateReservation;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public void confirmerReservation() {
        this.statut = "Confirmée";
        System.out.println("Réservation " + numeroReservation + " confirmée.");
    }

    public void annulerReservation() {
        this.statut = "Annulée";
        System.out.println("Réservation " + numeroReservation + " annulée.");
    }

    public void modifierReservation(String nouvelleDate) {
        this.dateReservation = nouvelleDate;
        System.out.println("Réservation " + numeroReservation + " modifiée à la date : " + nouvelleDate);
    }
}