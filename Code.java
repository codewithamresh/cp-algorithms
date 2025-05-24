import java.util.*;
import java.io.*;
import java.math.*;


public class Code {



public static boolean isPrime(int n){

    if (n <= 1) return false;
    if (n <= 3) return true; // 2 and 3 are prime
    if (n % 2 == 0 || n % 3 == 0) return false;

    for (int i = 5;  i < n; i++) {
        if (n % i == 0) return false;
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