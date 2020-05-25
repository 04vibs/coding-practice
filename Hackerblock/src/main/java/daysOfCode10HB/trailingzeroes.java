package daysOfCode10HB;
import java.util.*;

public class trailingzeroes {
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        
        int ans = 0;
        int p = 5;
        
        while((n/p) > 0) {
        ans += (n/p);
        p = p*5;
        }
        System.out.print(ans);
        
    }
}
