import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AvionTest {

    @Test
    void testAvionCreation() {
        Avion avion = new Avion("F-39", "Boeing 747", 300);
        assertEquals("F-39", avion.getImmatriculation());
        assertEquals("Boeing 747", avion.getModele());
        assertEquals(300, avion.getCapacite());
    }

    @Test
    void testVerifierDisponibilite() {
        Avion avion = new Avion("F-39", "Boeing 747", 300);
        assertTrue(avion.verifierDisponibilite());
    }

    @Test
    void testAffecterVol() {
        Avion avion = new Avion("F-39", "Boeing 747", 300);
        avion.affecterVol(); // Vérifie que la méthode ne plante pas
    }
}
