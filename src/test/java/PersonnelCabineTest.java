import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PersonnelCabineTest {

    @Test
    void testPersonnelCabineCreation() {
        PersonnelCabine personnel = new PersonnelCabine(2, "Julie Martin", "45 Rue de l'aigle", "0112233445", 102, "15/04/2019", "Hôtesse de l'air");
        assertEquals(2, personnel.identifiant);
        assertEquals("Sarah Johnson", personnel.nom);
        assertEquals("456 Rue", personnel.adresse);
        assertEquals("0112233445", personnel.contact);
        assertEquals(102, personnel.getNumeroEmploye());
        assertEquals("15/03/2018", personnel.getDateEmbauche());
        assertEquals("Hôtesse de l'air", personnel.getPoste());
    }

    @Test
    void testAffecterVol() {
        PersonnelCabine personnel = new PersonnelCabine(2, "Julie Martin", "456 Rue de l'aigle", "0112233445", 102, "15/04/2019", "Hôtesse de l'air");
        personnel.affecterVol(); 
    }
}
