import java.util.Scanner;

public class BruteForceForExponent {
    

public static Scanner sc = new Scanner(System.in);

// recursion
public static long exponent(int a, int n){
    if(a == 0 || a == 1) return a;
    if(n == 0) return 1;
    return a * exponent(a, n - 1);
}

// iteration
public static long exponent2(int a, int n){
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
    long result = exponent2(a, n);
    System.out.println(result);
}


}
