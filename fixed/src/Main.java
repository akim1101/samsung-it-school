public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Pet KeshaTheParrot = new Pet("Kesha", "Akim", "Budgie");
        Pet ChubasikTheCat = new Pet("Barsik", "Maksim", "Cat");
        Pet AlexThePuma = new Pet("Alex", "Larisa", "Puma");
        KeshaTheParrot.ShowInfo();
        System.out.println();
        ChubasikTheCat.ShowInfo();
        System.out.println();
        AlexThePuma.ShowInfo();
    }
}