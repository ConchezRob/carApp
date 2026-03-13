import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class ConducteurTest {

    private Conducteur conducteur;

    @BeforeEach
    public void setUp() {
        conducteur = new Conducteur("John", 20);
    }

    @Test
    public void testEstAdulte() {
        assertThat(conducteur.estAdulte()).isTrue();
    }
    
}
