package pepcoding;
import java.util.*;

public class prime {

    public static void main(String args[]) {
        // TODO code application logic here
        Scanner scn = new Scanner(System.in);
        
        int low = scn.nextInt();
        int high = scn.nextInt();
        //int count = 0;
        
        while(low <= high) {
          
            if(checkPrime(low)) {
                System.out.println(low);
            } 
            low++;
        }
    }
    
    public static boolean checkPrime(int num) {
        
        int div = 2;
        while(div*div<num) {
            if(num%div ==0) {
                return false;
            }
        }
        return true;
    }
}
