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
    public void testAccelerate() {
        car.accelerate();
        String output = outContent.toString();
        assertThat(output).contains("Model: Sedan");
        assertThat(output).contains("Color: Blue");
        assertThat(output).contains("Current speed: 10");
    }

    @Test
    public void testSlowDown() {
        car.accelerate();
        outContent.reset();
        car.slowDown();
        String output = outContent.toString();
        assertThat(output).contains("Current speed: 0");
    }

    @Test
    public void testStartCar() {
        car.startCar(driver);
        String output = outContent.toString();
        assertThat(output).contains("John starts the car.");
    }

    @Test
    public void testStopCar() {
        car.stopCar(driver);
        String output = outContent.toString();
        assertThat(output).contains("John stops the car.");
    }

    @Test
    public void testChangeSpeed() {
        car.changeSpeed(driver, 80);
        String output = outContent.toString();
        assertThat(output).contains("John changes the car speed to 80");
        assertThat(output).contains("Current speed: 80");
    }

    @Test
    public void testMaxSpeed() {
        car.changeSpeed(driver, 120);
        car.accelerate();
        assertThat(car.getSpeed()).isEqualTo(Car.MAX_SPEED);
    }

    @Test
    public void testMinSpeed(){
        car.changeSpeed(driver, 0);
        car.slowDown();
        assertThat(car.getSpeed()).isEqualTo(0);
    }
}
