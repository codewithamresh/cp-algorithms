
import java.util.Scanner;
import java.math.BigInteger;

public class BinaryExponentiation {

    public static Scanner sc = new Scanner(System.in);

    public static BigInteger binpow(int base, long n) {

        if (n == 0) {
            return BigInteger.ONE;
        }


        // result container
        BigInteger result = BigInteger.ONE;

        // make a is bigintger
        BigInteger a = BigInteger.valueOf(base);

        while(n > 0){

             // odd
             if(( n & 1 ) >= 1){

                result = result.multiply(a) ;

             }

             // a * a
             a = a.multiply(a);

             // reduce power
             n >>= 1;
             


        }

return  result;

    }

    public static void main(String[] args) {
        int a = sc.nextInt();
        int n = sc.nextInt();

        System.out.println(binpow(a, n));

    }

}
