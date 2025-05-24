import java.util.*;
import java.io.*;
import java.math.*;


public class Code {

private static int MOD = 1000000000 + 7;

public static boolean isPrime(int n){

    if (n <= 1) return false;
    if (n <= 3) return true; // 2 and 3 are prime
    if (n % 2 == 0 || n % 3 == 0) return false;

    // Check only numbers of the form 6k ± 1
    for (int i = 5; i * i <= n; i += 6) {
        if (n % i == 0 || n % (i + 2) == 0) return false;
    }

    return true;

}


public static Scanner sc = new Scanner(System.in);
public static void main(String[] args) {
	
	int time = sc.nextInt();

	while(time-- > 0){

int n = sc.nextInt();
System.out.println(isPrime(n));

	}

}


}