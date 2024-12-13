import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EmployeTest {

    @Test
    void testEmployeCreation() {
        Employe employe = new Employe(1, "Kamilla", "23 Rue Victor Hugo", "0789550912", 101, "12/03/2024");
        assertEquals(1, employe.identifiant);
        assertEquals("John Doe", employe.nom);
        assertEquals("23 Rue Victor Hugo", employe.adresse);
        assertEquals("0789550912", employe.contact);
        assertEquals(101, employe.getNumeroEmploye());
        assertEquals("12/03/2024", employe.getDateEmbauche());
    }
}
