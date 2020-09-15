package array2D;
import java.util.*;

public class spiralPrint {


public static void spiralprint(int a[][], int m, int n) {

    int startRow=0;
    int startCol=0;
    int endRow=m-1;
    int endCol=n-1;

     while(startRow <= endRow && startCol <= endCol){

    // firstRow
        for(int i=startCol; i<=endCol; i++){
            System.out.print(a[startRow][i]+" ");
        } 
        startRow++;

        for(int i=startRow; i<=endRow;i++){
            System.out.print(a[i][endCol]+" ");
        }
        endCol--;

        if(endRow > startRow) {
        for(int i=endCol; i>= startCol; i--){
            System.out.print(a[endRow][i]+" ");
        }
        endRow--;
        }

        if(endCol > startCol){
        for(int i=endRow; i>=startRow;i--){
            System.out.print(a[i][startCol]+" ");
        }
        startCol++;
        }
    }
}

    
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
//        
//    int a[1000][1000] = {0};
    int m = sc.nextInt();
    int n= sc.nextInt();
    int a[][] = new int[m][n];
    int val=1;
    for(int row=0;row<=m-1;row++){
        for(int col = 0;col<=n-1;col++){
            a[row][col] = val;
            val +=1;
            System.out.print(a[row][col]+" ");
        }
        
        System.out.println("");
    }
    spiralprint(a,m,n);
    
    }

}








