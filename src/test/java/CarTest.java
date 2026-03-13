import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {

    private Car car;
    private Driver driver;
    private final java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
    private final java.io.PrintStream originalOut = System.out;

    @BeforeEach
    public void setUp() {
        car = new Car("Sedan", "Blue");
        System.setOut(new java.io.PrintStream(outContent));
        driver = new Driver("John", 20);
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() {
        System.setOut(originalOut);
        outContent.reset();
    }

    @Test
    public void should_accelerate() {
        // GIVEN
        // Car initialized in setUp
        // WHEN
        car.accelerate();
        // THEN
        String output = outContent.toString();
        assertThat(output).contains("Model: Sedan");
        assertThat(output).contains("Color: Blue");
        assertThat(output).contains("Current speed: 10");
    }

    @Test
    public void should_slow_down() {
        // GIVEN
        car.accelerate();
        outContent.reset();
        // WHEN
        car.slowDown();
        // THEN
        String output = outContent.toString();
        assertThat(output).contains("Current speed: 0");
    }

    @Test
    public void should_start_car() {
        // GIVEN
        // Car initialized in setUp
        // WHEN
        car.startCar(driver);
        // THEN
        String output = outContent.toString();
        assertThat(output).contains("John starts the car.");
    }

    @Test
    public void should_stop_car() {
        // GIVEN
        // Car initialized in setUp
        // WHEN
        car.stopCar(driver);
        // THEN
        String output = outContent.toString();
        assertThat(output).contains("John stops the car.");
    }

    @Test
    public void should_change_speed() {
        // GIVEN
        // Car initialized in setUp
        // WHEN
        car.changeSpeed(driver, 80);
        // THEN
        String output = outContent.toString();
        assertThat(output).contains("John changes the car speed to 80");
        assertThat(output).contains("Current speed: 80");
    }

    @Test
    public void should_reach_max_speed() {
        // GIVEN
        car.changeSpeed(driver, 120);
        // WHEN
        car.accelerate();
        // THEN
        assertThat(car.getSpeed()).isEqualTo(Car.MAX_SPEED);
    }

    @Test
    public void should_reach_min_speed(){
        // GIVEN
        car.changeSpeed(driver, 0);
        // WHEN
        car.slowDown();
        // THEN
        assertThat(car.getSpeed()).isEqualTo(0);
    }
}
