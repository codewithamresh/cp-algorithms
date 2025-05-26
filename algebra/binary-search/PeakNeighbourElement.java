import java.util.*;
import java.io.*;
import java.math.*;


public class PeakNeighbourElement {


    public static int findPeakElement(int[] arr) {
      if ( arr.length == 0) return -1;

      int start = 0;
      int end = arr.length -1;
      while(start < end){

        int mid = ( start + end ) / 2 ;

        if(arr[mid] < arr[mid + 1]){
            start  = mid + 1;
        } else{
            end = mid ;
        }

      }

      return start; // start or end both are equal
    }



public static Scanner sc = new Scanner(System.in);
public static void main(String[] args) {
    
    int time = sc.nextInt();

while(time-- > 0){

int n = sc.nextInt();
int[] arr = new int[n];

for (int i = 0; i < n ; i++ ) {
    arr[i] = sc.nextInt();
}

System.out.println(findPeakElement(arr));

    }

}


}