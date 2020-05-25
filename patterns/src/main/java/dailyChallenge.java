import java.util.*;

public class dailyChallenge {

    public static void main(String args[]) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter n");;
        int n = input.nextInt();
        
        for(int k = 1; k<=n;k++){}
        // 1st component
        
           for(int i=n;i>=1;i--) {
            
           //spaces
            for(int k=1;k<=(n-i);k++){
                System.out.print(" ");
            }
            
            // num
            for(int j=i;j>=1;j--){
            System.out.print(j);
            }
            System.out.println(" ");
            
        }
        
        // 2nd component
         for(int i=n;i>=1;i--) {
             System.out.print("0");
            for(int j=1;j<=i;j++){
            System.out.print(j);
            }
            System.out.println(" ");
        } 
         
        // 3rd component
        System.out.println("0");
       
        // 4th component
        
        for(int i=1;i<=n;i++) {
            for(int k=1; k<=(n-i);k++) {
            System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
            System.out.print(j);
            }
            System.out.println("");
          
        }
        // 5th component
        for(int i=1;i<=n;i++) {
            System.out.print("0");
            for(int j=1;j<=i;j++){
            System.out.print(j);
            }
            System.out.println(" ");
        }
        
        for(int i=1;i<=n;i++){
            
        }
    }
}
