public class Application {
    public static void main(String[] args) {
        Car myCar = new Car("Sedan", "Blue");
        Driver me = new Driver("John", 20);

        myCar.startCar(me);
        myCar.accelerate();
        myCar.changeSpeed(me, 80);
        myCar.slowDown();
        myCar.changeSpeed(me, 30);
        myCar.stopCar(me);
        System.out.println("finished");
    }
}
