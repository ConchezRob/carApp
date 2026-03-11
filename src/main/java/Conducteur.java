public class Conducteur {
    public static final int AGE_LEGAL = 10;
    private final String nom;
    private final int age;

    public Conducteur(final String name, final int years) {
        this.nom = name;
        this.age = years;
    }

    public boolean estAdulte() {
        return AGE_LEGAL <= age;
    }

    public void demarrerVoiture() {
        final boolean estAldulte = this.estAdulte();
        if (estAldulte) {
            System.out.println(nom + " démarre la voiture.");
        } else {
            System.out.println("Le conducteur n'est pas assez âgé pour conduire.");
        }
    }

    public void arreterVoiture() {
        System.out.println(nom + " arrête la voiture.");
    }

    public void changerVitesse(final Voiture voiture, final int nouvelleVitesse) {
        System.out.println(nom + " change la vitesse de la voiture à " + nouvelleVitesse);
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
