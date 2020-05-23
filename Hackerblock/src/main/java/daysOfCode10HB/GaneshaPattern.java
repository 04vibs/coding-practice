package daysOfCode10HB;
import java.util.*;

public class GaneshaPattern {
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        
        // print component by component
        // 5components
        
        //1st component
        System.out.print("*");
        for(int i=1; i<=(n-3)/2;i++) {
            System.out.print(" ");
        }
        for(int i=1;i<=(n+1)/2;i++) {
            System.out.print("*");
        }
        System.out.println("");
        
        // 2nd component
        for(int rows = 1; rows<=(n-3)/2; rows++) {
            System.out.print("*");
            // spaces
            for(int i=1; i<=(n-3)/2;i++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println("");
        }
     
        // 3rd component
        for(int i=1;i<=n;i++) {
            System.out.print("*");
        }
        System.out.println();
        
        // 4th component
        for(int rows =1; rows <=(n-3)/2; rows++) {
        
            //spaces
            for(int i=1;i<=((n-3)/2)+1;i++) {
                System.out.print(" ");
            }
            
            //star
            System.out.print("*");
            //System.out.println();
            

            //spaces
            for(int i=1;i<=(n-3)/2;i++) {
                System.out.print(" ");
            }
            //star
            System.out.print("*");
            System.out.println("");
        }
        
        // 5th component
        
        // stars
        for(int i=1; i<=(n+1)/2;i++) {
            System.out.print("*");
        }
        
        // spaces
        for(int i=1;i<=(n-3)/2;i++) {
            System.out.print(" ");
        }
        //single star
        System.out.print("*");
        System.out.println();
    }
}
