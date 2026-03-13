public class Application {
    public static void main(String[] args) {
        Voiture maVoiture = new Voiture("Sedan", "Bleu");
        Conducteur moi = new Conducteur("John", 20);

        maVoiture.demarrerVoiture(moi);
        maVoiture.accelerer();
        maVoiture.changerVitesse(moi, 80);
        maVoiture.ralentir();
        maVoiture.changerVitesse(moi, 30);
        maVoiture.arreterVoiture(moi);
        System.out.println("fini");
    }
}
