/*
        1
      2 3 2
    3 4 5 4 3
  4 5 6 7 6 5 4
5 6 7 8 9 8 7 6 5
*/
import java.util.*;
public class pattern8 {
    public static void main(String args[]) {
        // TODO code application logic here
        System.out.println("Hello WOrld");
        Scanner input = new Scanner(System.in);
        int i, space, rows, k=0, count=0, count1=0;
        rows = input.nextInt();
        for(i=1; i<=rows;++i){
            for(space = 1; space<=rows-i;++space) {
                System.out.print(" ");
                ++count;
            }
            while(k!= 2*i-1) {
            if(count<= rows-1){
                System.out.print(i+k);
                ++count;
            } else {
                ++count1;
                System.out.print((i+k-2*count1));
            }++k;
            }
            count1=count=k=0;
            System.out.println();
            
            }
   }
 }

