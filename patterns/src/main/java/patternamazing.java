/*

                            5 4 3 2 1 0 1 2 3 4 5
                            4 3 2 1 0 1 2 3 4 
                              3 2 1 0 1 2 3 
                                2 1 0 1 2 
                                  1 0 1 
                                    0 
                                  1 0 1 
                                2 1 0 1 2 
                              3 2 1 0 1 2 3 
                            4 3 2 1 0 1 2 3 4 
                          5 4 3 2 1 0 1 2 3 4 5

*/
import java.util.*;

public class patternamazing {

    public static void main(String args[]) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter n");;
        int n = input.nextInt();
        
        
        // component 1
        
        for (int i = n; i >=1 ; i--) 
        {
              // spaces
            for (int j = 0; j <= (n-i); j++) 
            {
                System.out.print(" ");
            }
              
            for (int k = i; k >= 1; k--) {
            System.out.print(k+" ");
           }
             for(int m=0; m <= i; m++) {
                System.out.print(m+" ");
            }
            System.out.println(); 
        } 
        
//        for(int i=1; i<=n;i++) {
//            
//        }
        
        // 2nd component
        
        for (int i = 1; i <= n; i++) { 
            for(int j =1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int k = i; k >= 1; k--) {
                System.out.print(k+" ");
            }
            
            for( int l=0;l<=i;l++){
                System.out.print(l+" ");
            }
            
            System.out.println();
        }  
 
    }
}
