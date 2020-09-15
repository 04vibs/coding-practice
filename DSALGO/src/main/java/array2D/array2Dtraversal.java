package array2D;
import java.util.*;

public class array2Dtraversal {

    public static void main(String args[]) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        
        int m = sc.nextInt();
        int n = sc.nextInt();
        int a[][] = new int[m][n];
        
        int val=1;
        for(int row = 0; row<= m-1;row++){
            for(int col = 0; col<=n-1; col++){
                a[row][col] = val;
                val = val+1;
                System.out.print(a[row][col] + " ");
                
            }
            System.out.println("");
        }
        
        // wave print
        for(int col =0; col<n;col++){
            if(col%2==0){
                // top down approach
                for(int row=0;row<m;row++){
                    System.out.print(a[row][col]+" ");
                }
            } else{
                //down up approach
                for(int row=m-1;row>=0;row--){
                    System.out.print(a[row][col]+" ");
                }
            }
        }
    }
}
