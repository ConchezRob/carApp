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
    public void testIsAdult() {
        assertThat(driver1.isAdult()).isTrue();
    }

    @Test
    public void testIsNotAdult(){
        assertThat(driver2.isAdult()).isFalse();
    }

    @Test void testIsAdultBoundary() {
        assertThat(driver3.isAdult()).isTrue();
    }
    
}
