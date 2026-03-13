public class Car {
    public static final int ACCELERATION_VALUE = 10;
    public static final int MAX_SPEED = 120;
    private final String model;
    private final String color;
    private int speed;

    public Car(final String carModel, final String carColor) {
        this.model = carModel;
        this.color = carColor;
        this.speed = 0;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void accelerate() {
        if (this.speed + ACCELERATION_VALUE <= MAX_SPEED) {
            speed += ACCELERATION_VALUE;
            // show details
            printDetails();
        } else {
            System.out.println("Maximum speed reached.");
        }
    }

    private void printDetails(){
        System.out.println("Model: " + this.model);
        System.out.println("Color: " + this.color);
        System.out.println("Current speed: " + this.speed);
    }

    public void slowDown() {
        if (speed - ACCELERATION_VALUE >= 0) {
            speed -= ACCELERATION_VALUE;
            // show details
            printDetails();
        } else {
            System.out.println("The car is already stopped.");
        }
    }

    public void startCar(final Driver driver) {
        final boolean isAdult = driver.isAdult();
        if (isAdult) {
            System.out.println(driver.getName() + " starts the car.");
        } else {
            System.out.println("The driver is not old enough to drive.");
        }
    }

    public void stopCar(final Driver driver) {
        System.out.println(driver.getName() + " stops the car.");
    }

    public void changeSpeed(final Driver driver, final int newSpeed) {
        System.out.println(driver.getName() + " changes the car speed to " + newSpeed);
        if (this.speed >= newSpeed) {
            while (this.speed > newSpeed) {
                this.slowDown();
            }
        } else  {
            while (this.speed < newSpeed) {
                this.accelerate();
            }
        }
    }
}

