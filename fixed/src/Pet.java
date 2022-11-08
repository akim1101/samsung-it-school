public class Pet {
    private String petName;
    private String ownersName;
    private String petType;

    public Pet(String petName, String ownersName, String petType) {
        this.petName = petName;
        this.ownersName = ownersName;
        this.petType = petType;
    }

    public void showInfo() {
        System.out.println("Кличка питомца: " + this.petName);
        System.out.println("Имя владельца: " + this.ownersName);
        System.out.println("Тип животного: " + this.petName);
    }
}

