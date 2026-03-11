public class Application {
    public static void main(String[] args) {
        Voiture maVoiture = new Voiture("Sedan", "Bleu");
        Conducteur moi = new Conducteur("John", 20);

        moi.demarrerVoiture();
        maVoiture.accelerer();
        moi.changerVitesse(maVoiture, 80);
        maVoiture.ralentir();
        moi.changerVitesse(maVoiture,30);
        moi.arreterVoiture();
        System.out.println("fini");
    }
}
