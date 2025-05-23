import java.util.*;
import java.io.*;
import java.math.*;


public class FiboMod {

private static int MOD = 1000000000 + 7;

public static int getFibo(int n){

int f0 = 0;
int f1 = 1;


if(n == 0 || n == 1) return n;

for (int i = 2; i <= n ; i++ ) {
 int temp = (f0 % MOD + f1 % MOD) % MOD;
 f0 = f1;
 f1 = temp;
 
}

return f1;

}


public static Scanner sc = new Scanner(System.in);
public static void main(String[] args) {
	
	int time = sc.nextInt();

	while(time-- > 0){

int n = sc.nextInt();
System.out.println(getFibo(n));

	}

}


}