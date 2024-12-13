import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PassagerTest {

    @Test
    void testPassagerCreation() {
        Passager passager = new Passager("AZ2", "Ornela", "456 Avenue Orange", "0789563412", "FR321");
        assertEquals("AZ2", passager.identifiant);
        assertEquals("Alice", passager.nom);
        assertEquals("456 Avenue Orange", passager.adresse);
        assertEquals("0789563412", passager.contact);
        assertEquals("FR321", passager.getPasseport());
    }

    @Test
    void testReserverVol() {
        Passager passager = new Passager("AZ2", "Ornela", "456 Avenue Orange", "0789563412", "FR321");
        Reservation reservation = new Reservation(1, 20231212, "En attente");
        passager.reserverVol(reservation);
        assertEquals(1, passager.obtenirReservations().size());
    }

    @Test
    void testAnnulerReservation() {
        Passager passager = new Passager("AZ2", "Ornela", "456 Avenue Orange", "0789563412", "FR321");
        Reservation reservation = new Reservation(1, 20231212, "En attente");
        passager.reserverVol(reservation);
        passager.annulerReservation("1");
        assertTrue(passager.obtenirReservations().isEmpty());
    }
}
