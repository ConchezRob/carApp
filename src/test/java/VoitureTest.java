import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class VoitureTest {

    private Voiture voiture;
    private final java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
    private final java.io.PrintStream originalOut = System.out;

    @BeforeEach
    public void setUp() {
        voiture = new Voiture("Sedan", "Bleu");
        System.setOut(new java.io.PrintStream(outContent));
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() {
        System.setOut(originalOut);
        outContent.reset();
    }

    @Test
    public void testAccelerer() {
        voiture.accelerer();
        String output = outContent.toString();
        assertThat(output).contains("Modèle : Sedan");
        assertThat(output).contains("Couleur : Bleu");
        assertThat(output).contains("Vitesse actuelle : 10");
    }

    @Test
    public void testRalentir() {
        voiture.accelerer();
        outContent.reset();
        voiture.ralentir();
        String output = outContent.toString();
        assertThat(output).contains("Vitesse actuelle : 0");
    }

    @Test
    public void testDemarrerVoiture() {
        Conducteur conducteur = new Conducteur("John", 20);
        voiture.demarrerVoiture(conducteur);
        String output = outContent.toString();
        assertThat(output).contains("John démarre la voiture.");
    }

    @Test
    public void testArreterVoiture() {
        Conducteur conducteur = new Conducteur("John", 20);
        voiture.arreterVoiture(conducteur);
        String output = outContent.toString();
        assertThat(output).contains("John arrête la voiture.");
    }

    @Test
    public void testChangerVitesse() {
        Conducteur conducteur = new Conducteur("John", 20);
        voiture.changerVitesse(conducteur, 80);
        String output = outContent.toString();
        assertThat(output).contains("John change la vitesse de la voiture à 80");
        assertThat(output).contains("Vitesse actuelle : 80");
    }
}
