import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a = 0;
        a += n;
        if (n / 10 > 10){
            n = n - 100;
            switch (n){
                case 1:
                    System.out.println(a + " " + "TORT");
                    break;
                case 2:
                    System.out.println(a + " " + "TORTA");
                    break;
                case 3:
                    System.out.println(a + " " + "TORTA");
                    break;
                case 4:
                    System.out.println(a + " " + "TORTA");
                    break;
                case 5:
                    System.out.println(a + " " + "TORTOV");
                    break;
                case 6:
                    System.out.println(a + " " + "TORTOV");
                    break;
                case 7:
                    System.out.println(a + " " + "TORTOV");
                    break;
                case 8:
                    System.out.println(a + " " + "TORTOV");
                    break;
                case 9:
                    System.out.println(a + " " + "TORTOV");
                    break;
                case 10:
                    System.out.println(a + " " + "TORTOV");
                    break;
                case 11:
                    System.out.println(a + " " + "TORTOV");
                    break;
                case 12:
                    System.out.println(a + " " + "TORTOV");
                    break;
                case 13:
                    System.out.println(a + " " + "TORTOV");
                    break;
                case 14:
                    System.out.println(a + " " + "TORTOV");
                    break;
                case 15:
                    System.out.println(n + " " + "TORTOV");
                    break;
                case 16:
                    System.out.println(a + " " + "TORTOV");
                    break;
                case 17:
                    System.out.println(a + " " + "TORTOV");
                    break;
                case 18:
                    System.out.println(a + " " + "TORTOV");
                    break;
                case 19:
                    System.out.println(a + " " + "TORTOV");
                    break;
                case 20:
                    System.out.println(a + " " + "TORTOV");
                    break;
                default:
                    if (a % 10 == 0){
                        System.out.println(a + " " + "TORTOV");
                    } else if (a % 10 == 1) {
                        System.out.println(a + " " + "TORT");
                    } else if (a % 10 == 2) {
                        System.out.println(a + " " + "TORTA");
                    } else if (a % 10 == 3) {
                        System.out.println(a + " " + "TORTA");
                    } else if (a % 10 == 4) {
                        System.out.println(a + " " + "TORTA");
                    } else if (a % 10 == 5) {
                        System.out.println(a + " " + "TORTOV");
                    } else if (a % 10 == 6) {
                        System.out.println(a + " " + "TORTOV");
                    } else if (a % 10 == 7) {
                        System.out.println(a + " " + "TORTOV");
                    } else if (a % 10 == 8) {
                        System.out.println(a + " " + "TORTOV");
                    } else if (a % 10 == 9) {
                        System.out.println(a + " " + "TORTOV");
                    }
        }

        } else {
            switch (n){
                case 1:
                    System.out.println(n + " " + "TORT");
                    break;
                case 2:
                    System.out.println(n + " " + "TORTA");
                    break;
                case 3:
                    System.out.println(n + " " + "TORTA");
                    break;
                case 4:
                    System.out.println(n + " " + "TORTA");
                    break;
                case 5:
                    System.out.println(n + " " + "TORTOV");
                    break;
                case 6:
                    System.out.println(n + " " + "TORTOV");
                    break;
                case 7:
                    System.out.println(n + " " + "TORTOV");
                    break;
                case 8:
                    System.out.println(n + " " + "TORTOV");
                    break;
                case 9:
                    System.out.println(n + " " + "TORTOV");
                    break;
                case 10:
                    System.out.println(n + " " + "TORTOV");
                    break;
                case 11:
                    System.out.println(n + " " + "TORTOV");
                    break;
                case 12:
                    System.out.println(n + " " + "TORTOV");
                    break;
                case 13:
                    System.out.println(n + " " + "TORTOV");
                    break;
                case 14:
                    System.out.println(n + " " + "TORTOV");
                    break;
                case 15:
                    System.out.println(n + " " + "TORTOV");
                    break;
                case 16:
                    System.out.println(n + " " + "TORTOV");
                    break;
                case 17:
                    System.out.println(n + " " + "TORTOV");
                    break;
                case 18:
                    System.out.println(n + " " + "TORTOV");
                    break;
                case 19:
                    System.out.println(n + " " + "TORTOV");
                    break;
                case 20:
                    System.out.println(n + " " + "TORTOV");
                    break;
                default:
                    if (a % 10 == 0){
                        System.out.println(n + " " + "TORTOV");
                    } else if (a % 10 == 1) {
                        System.out.println(n + " " + "TORT");
                    } else if (a % 10 == 2) {
                        System.out.println(n + " " + "TORTA");
                    } else if (a % 10 == 3) {
                        System.out.println(n + " " + "TORTA");
                    } else if (a % 10 == 4) {
                        System.out.println(n + " " + "TORTA");
                    } else if (a % 10 == 5) {
                        System.out.println(n + " " + "TORTOV");
                    } else if (a % 10 == 6) {
                        System.out.println(n + " " + "TORTOV");
                    } else if (a % 10 == 7) {
                        System.out.println(n + " " + "TORTOV");
                    } else if (a % 10 == 8) {
                        System.out.println(n + " " + "TORTOV");
                    } else if (a % 10 == 9) {
                        System.out.println(n + " " + "TORTOV");
                    }

            }
        }

    }
}

