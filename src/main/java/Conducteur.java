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

    public void demarrerVoiture() {
        final boolean estAldulte = this.estAdulte();
        if (estAldulte) {
            System.out.println(name + " démarre la voiture.");
        } else {
            System.out.println("Le conducteur n'est pas assez âgé pour conduire.");
        }
    }

    public void arreterVoiture() {
        System.out.println(name + " arrête la voiture.");
    }

    public void changerVitesse(final Voiture voiture, final int nouvelleVitesse) {
        System.out.println(name + " change la vitesse de la voiture à " + nouvelleVitesse);
        int vitesseActuelle = voiture.getVitesse();
        if (vitesseActuelle >= nouvelleVitesse) {
            while (vitesseActuelle > nouvelleVitesse) {
                voiture.ralentir();
                vitesseActuelle = voiture.getVitesse();
            }
        } else  {
            while (vitesseActuelle < nouvelleVitesse) {
                voiture.accelerer();
                vitesseActuelle = voiture.getVitesse();
            }
        }
    }
}
