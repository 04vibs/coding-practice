import java.util.*;

public class pascalpattern1 {
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int rows, value=1, space,i,j;
        rows = input.nextInt();
       if(rows<=10) {
        for(i=0;i<rows;i++){
//            for(space=1;space<=rows-i;space++) {
//                System.out.print(" ");
//            }
            for(j=0;j<=i;j++) {
            if(j==0 || i==0) {
            value=1;
            }else{
            value = value*(i-j+1)/j;
            }
            
                System.out.print("  ");
                System.out.print(value);
		}
                System.out.println();
            }
        }
    }
}