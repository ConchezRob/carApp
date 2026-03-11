public class Voiture {
    public static final int VALEUR_ACCELERATION = 10;
    public static final int VITESSE_MAX = 120;
    private final String modele;
    private final String couleur;
    private int vitesse;

    public Voiture(final String model, final String color) {
        this.modele = model;
        this.couleur = color;
        this.vitesse = 0;
    }

    public int getVitesse() {
        return this.vitesse;
    }

    public void accelerer() {
        if (vitesse + VALEUR_ACCELERATION <= VITESSE_MAX) {
            vitesse += VALEUR_ACCELERATION;
            // afficher détails
            System.out.println("Modèle : " + modele);
            System.out.println("Couleur : " + couleur);
            System.out.println("Vitesse actuelle : " + vitesse);
        } else {
            System.out.println("La vitesse maximale est atteinte.");
        }
    }

    public void ralentir() {
        if (vitesse - VALEUR_ACCELERATION >= 0) {
            vitesse -= VALEUR_ACCELERATION;
            // afficher détails
            System.out.println("Modèle : " + modele);
            System.out.println("Couleur : " + couleur);
            System.out.println("Vitesse actuelle : " + vitesse);
        } else {
            System.out.println("La voiture est déjà à l'arrêt.");
        }
    }
}

