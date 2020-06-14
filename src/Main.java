
import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] arr) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {


            BigDecimal bignum1 = sc.nextBigDecimal();
            BigDecimal bignum2 = sc.nextBigDecimal();
            BigDecimal bignum3 = null;


            bignum3 = bignum1.subtract(bignum2);
            if (bignum1.compareTo(bignum2)==0) {
                System.out.println("=");
            } else if (bignum1.compareTo(bignum2) == 1) {
                System.out.println(">");
            } else {
                System.out.println("<");
            }

        }}
}





