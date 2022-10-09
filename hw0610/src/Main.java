import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        if (10 > a && a >= 0){
            System.out.println("DIGIT");
        } else {
            if (a >= 10 && a < 100){
                System.out.println("NUM");
            }else {
                System.out.println("OTHER");
            }
        }
    }
}