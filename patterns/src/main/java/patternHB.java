import java.util.*;

public class patternHB {

    public static void main(String args[]) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        
        int a,b,c,d,e=0,k=n;
        
        
         for (int i = n; i >=1 ; i--) 
        {
              // spaces
            for (int j = 0; j <= (n-i); j++) 
            {
                System.out.print(" ");
            }
              
            for (int l = i; l >= 1; l--) {
            System.out.print(l+" ");
           }
             for(int m=0; m <= i; m++) {
                System.out.print(m+" ");
            }
            System.out.println(); 
        } 
         
        for(a=0;a<n+1;a++) {
            for(b=0;b<k;b++) {
                System.out.print(" ");
            }
            k--;
            for(c=e;c>=0;c--) {
                System.out.print(c+" ");
            }
            for(d=1;d<a+1;d++) {
                System.out.print(d+" ");
            }
            e++;
            System.out.println("");
        }
    }
}
