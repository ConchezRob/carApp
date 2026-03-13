public class Driver {
    public static final int LEGAL_AGE = 10;
    private final String name;
    private final int age;

    public Driver(final String name, final int age) {
        this.name = name;
        this.age = age;
    }

    public boolean isAdult() {
        return LEGAL_AGE <= age;
    }

    public String getName() { return this.name; }

}
