import java.util.*;
import java.io.*;
import java.math.*;


public class GCD {

public static int recGcd(int a, int b){
	if(a == 0  ) return b;
	if(b == 0  ) return a;
	return recGcd(b , a % b);
}

public static int gcd(int a, int b){
	while(b != 0){

       int temp = b;
       b = a % b;
       a = temp;

	}

	return a;

}

public static int gcd2(int a , int b ){

	while(a != 0){
		b = b % a;
		int t = b;
		b = a;
		a = t;
	}

	return b;
}

public static Scanner sc = new Scanner(System.in);
public static void main(String[] args) {
	
	int time = sc.nextInt();

	while(time-- > 0){
int a = sc.nextInt();
int b = sc.nextInt();
System.out.println(recGcd(a,b));;
	}

}


}