
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        float a1 = (float) a;
        float b1 = (float) b;
        float res1 = b1/a1;
        float res2 = -b1/a1;
        if(a <= 0 && b <= 0){
            System.out.println("no such x");
        } else if (a >= 0 && b >= 0) {
            System.out.println("any x");
        } else if (a > 0 && b < 0) {
            System.out.println("x" + "<" +  new BigDecimal(res1).setScale(1, RoundingMode.UP).doubleValue() + " or " + "x" + ">" + new BigDecimal(res2).setScale(1, RoundingMode.UP).doubleValue() );
        } else if (a < 0 && b > 0) {
            System.out.println(new BigDecimal(res1).setScale(1, RoundingMode.UP).doubleValue() + "<" + "x" + "<" + new BigDecimal(res2).setScale(1, RoundingMode.UP).doubleValue());
        }

    }
}
