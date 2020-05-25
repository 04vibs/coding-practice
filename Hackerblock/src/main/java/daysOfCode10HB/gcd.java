
package daysOfCode10HB;
import java.util.*;

public class gcd {
    public static int gcd(int a,int b) {
    return b ==0? a: gcd(b,a%b);
    }
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int a = input.nextInt();
        int b = input.nextInt();
        
        System.out.print(gcd(a,b));
        
    }
}
