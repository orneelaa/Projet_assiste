import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class AeroportTest {
    private Aeroport aeroport;

    @BeforeEach
    public void setUp() {
        aeroport = new Aeroport("Charles de Gaulle", "Paris", "Aéroport principal en France");
    }

    @Test
    public void testAfficherInfos() {
        assertDoesNotThrow(() -> aeroport.afficherInfos());
    }

    @Test
    public void testAffecterVol() {
        assertDoesNotThrow(() -> aeroport.affecterVol());
    }
}
