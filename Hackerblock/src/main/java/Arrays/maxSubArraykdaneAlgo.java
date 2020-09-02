package Arrays;
import java.util.*;

public class maxSubArraykdaneAlgo {

    public static void main(String args[]) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cs=0;
        int ms=0;
        
        int a[] = new int[n];
        for(int i=0; i<n;i++) {
            a[i] = sc.nextInt();
        }
        
        //kdane algo for max subArray
        for(int i=0; i<n;i++) {
            cs = cs+a[i];
            if(cs<0) {
                cs=0;
            }
            ms = Math.max(cs,ms);
        }
        System.out.println("maxsum is "+ ms);
    }
}
