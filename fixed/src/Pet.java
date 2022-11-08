public class Pet {
    public String pet_name;
    public String owners_name;
    public String pet_type;

    public Pet(String pet_name, String owners_name, String pet_type) {
        this.pet_name = pet_name;
        this.owners_name = owners_name;
        this.pet_type = pet_type;
    }

    public void ShowInfo() {
        System.out.println("Кличка питомца: " + this.pet_name);
        System.out.println("Имя владельца: " + this.owners_name);
        System.out.println("Тип животного: " + this.pet_type);
    }
}

