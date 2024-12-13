import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PersonneTest {

    @Test
    void testPersonneCreation() {
        Personne personne = new Personne("P-001", "Sarah Smith", "789 Boulevard Ocean", "0123456789");
        assertEquals("P-001", personne.identifiant);
        assertEquals("Jane Doe", personne.nom);
        assertEquals("789 Boulevard", personne.adresse);
        assertEquals("0123456789", personne.contact);
    }

    @Test
    void testGetIdentifiant() {
        Personne personne = new Personne("P-002", "Joshua Sunday", "123 Avenue Driver", "0987654321");
        assertEquals("P-002", personne.getIdentifiant());
    }
}
