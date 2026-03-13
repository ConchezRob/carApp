import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class DriverTest {

    private Driver driver1;
    private Driver driver2;
    private Driver driver3;

    @BeforeEach
    public void setUp() {
        driver1 = new Driver("John", 20);
        driver2 = new Driver("Theo", 9);
        driver3 = new Driver("Alice", 10);
    }

    @Test
    public void should_be_adult_if_age_is_20() {
        // GIVEN
        // Driver initialized in setUp
        // WHEN
        boolean result = driver1.isAdult();
        // THEN
        assertThat(result).isTrue();
    }

    @Test
    public void should_not_be_adult_if_age_is_9() {
        // GIVEN
        // Driver2 initialized in setUp
        // WHEN
        boolean result = driver2.isAdult();
        // THEN
        assertThat(result).isFalse();
    }

    @Test 
    public void should_be_adult_if_age_is_10() {
        // GIVEN
        // Driver3 initialized in setUp
        // WHEN
        boolean result = driver3.isAdult();
        // THEN
        assertThat(result).isTrue();
    }
    
}
