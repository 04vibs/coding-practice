import java.util.*;

public class HollowRhombusPattern {
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int num = input.nextInt();
        int i,j;
        for(i=1;i<=num;i++) {
            for(j=i;j<=num;j++) {
                System.out.print("*");
            }
            for(j=1;j<=(2*i-2);j++) {
                System.out.print(" ");
            }
            for(j=i;j<=num;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(i=1; i<=num; i++) {
            for(j=1; j<=i; j++) {
                System.out.print("*");
            }

            for(j=(2*i-2); j<(2*num-2); j++) {
                System.out.print(" ");
            }
            for(j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
