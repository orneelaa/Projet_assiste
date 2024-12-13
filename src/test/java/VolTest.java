import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VolTest {

    @Test
    void testVolCreation() {
        Vol vol = new Vol(1001, "Paris", "Singapour", 20231212, 20231213);
        assertEquals(1001, vol.getNumeroVol());
        assertEquals("Paris", vol.getOrigine());
        assertEquals("Singapour", vol.getDestination());
        assertEquals(20231212, vol.getDateHeureDepart());
        assertEquals(20231213, vol.getDateHeureArrivee());
        assertEquals("Prévu", vol.getEtat());
    }

    @Test
    void testAnnulerVol() {
        Vol vol = new Vol(1001, "Paris", "Singapour", 20231212, 20231213);
        vol.annulerVol();
        assertEquals("Annulé", vol.getEtat());
    }

    @Test
    void testPlanifierVol() {
        List<Vol> vols = new ArrayList<>();
        List<Vol> nouveauxVols = new ArrayList<>();
        nouveauxVols.add(new Vol(1002, "Tirana", "Tachkent", 20231214, 20231215));
        Vol.planifierVol(vols, nouveauxVols);
        assertEquals(1, vols.size());
    }
}
