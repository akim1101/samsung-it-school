public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Pet KeshaTheParrot = new Pet("Kesha", "Akim", "Budgie");
        Pet ChubasikTheCat = new Pet("Barsik", "Maksim", "Cat");
        Pet AlexThePuma = new Pet("Alex", "Larisa", "Puma");
        KeshaTheParrot.showInfo();
        System.out.println();
        ChubasikTheCat.showInfo();
        System.out.println();
        AlexThePuma.showInfo();
    }
}