import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PiloteTest {

    @Test
    void testPiloteCreation() {
        Pilote pilote = new Pilote(3, "Tom Cruise", "777 Hollywood Blvd", "0223344556", 103, "01/07/2010", "12345", "Capitaine");
        assertEquals(3, pilote.identifiant);
        assertEquals("Tom Cruise", pilote.nom);
        assertEquals("777 Hollywood Blvd", pilote.adresse);
        assertEquals("0223344556", pilote.contact);
        assertEquals(103, pilote.getNumeroEmploye());
        assertEquals("01/07/2010", pilote.getDateEmbauche());
        assertEquals("12345", pilote.getLicence());
        assertEquals("Capitaine", pilote.getGrade());
    }

    @Test
    void testVerifierDisponibilite() {
        Pilote pilote = new Pilote(3, "Tom Cruise", "777 Hollywood Blvd", "0223344556", 103, "01/07/2010", "12345", "Capitaine");
        assertTrue(pilote.verifierDisponibilite());
    }

    @Test
    void testAffecterVol() {
        Pilote pilote = new Pilote(3, "Tom Cruise", "777 Hollywood Blvd", "0223344556", 103, "01/07/2010", "12345", "Capitaine");
        pilote.affecterVol(); // Vérifie que la méthode ne plante pas
    }
}
