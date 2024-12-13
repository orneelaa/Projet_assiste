import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ReservationTest {

    @Test
    void testReservationCreation() {
        Reservation reservation = new Reservation(1, 20231212, "En attente");
        assertEquals(1, reservation.getNumeroReservation());
        assertEquals(20231212, reservation.getDateReservation());
        assertEquals("En attente", reservation.getStatut());
    }

    @Test
    void testConfirmerReservation() {
        Reservation reservation = new Reservation(1, 20231212, "En attente");
        reservation.confirmerReservation();
        assertEquals("Confirmée", reservation.getStatut());
    }

    @Test
    void testAnnulerReservation() {
        Reservation reservation = new Reservation(1, 20231212, "En attente");
        reservation.annulerReservation();
        assertEquals("Annulée", reservation.getStatut());
    }
}
