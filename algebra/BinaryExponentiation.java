import java.util.Scanner;

public class BinaryExponentiation{

public static Scanner sc = new Scanner(System.in);

// recursion
public static long binpow(int a, int n){
    if(a == 0 || a == 1) return a;
    if(n == 0) return 1;
    return a * binpow(a, n - 1);
}

// iteration
public static long binpow2(int a, int n){
    if(a == 0 || a == 1) return a;
    if(n == 0) return 1;
    long pow = 1;
    while(n > 0){
        pow *= a ; 
        n--;
    }
    return pow;
}

public static void main(String[] args) {
	int a = sc.nextInt();
    int n = sc.nextInt();
    long result = binpow2(a, n);
    System.out.println(result);
}

}