public class Conducteur {
    public static final int LEGAL_AGE = 10;
    private final String name;
    private final int age;

    public Conducteur(final String name, final int years) {
        this.name = name;
        this.age = years;
    }

    public boolean estAdulte() {
        return LEGAL_AGE <= age;
    }

    public String getName() { return this.name; }

}
