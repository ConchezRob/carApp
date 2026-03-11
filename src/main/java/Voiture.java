public class Voiture {
    public static final int ACCELERATION_VALUE = 10;
    public static final int MAX_SPEED = 120;
    private final String model;
    private final String color;
    private int vitesse;

    public Voiture(final String carModel, final String carColor) {
        this.model = carModel;
        this.color = carColor;
        this.vitesse = 0;
    }

    public int getVitesse() {
        return this.vitesse;
    }

    public void accelerer() {
        if (this.vitesse + ACCELERATION_VALUE <= MAX_SPEED) {
            vitesse += ACCELERATION_VALUE;
            // afficher détails
            printDetails();
        } else {
            System.out.println("La vitesse maximale est atteinte.");
        }
    }

    private void printDetails(){
        System.out.println("Modèle : " + this.model);
        System.out.println("Couleur : " + this.color);
        System.out.println("Vitesse actuelle : " + this.vitesse);
    }

    public void ralentir() {
        if (vitesse - ACCELERATION_VALUE >= 0) {
            vitesse -= ACCELERATION_VALUE;
            // afficher détails
            printDetails();
        } else {
            System.out.println("La voiture est déjà à l'arrêt.");
        }
    }
}

