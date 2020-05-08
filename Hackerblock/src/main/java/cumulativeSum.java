import java.util.*;

public class cumulativeSum {
    public static void main(String args[]) {
        // TODO code application logic here
//        System.out.println("Hello world");
//        Scanner input = new Scanner(System.in);
//        
//        int sum=0;
//        for(int i=0; i<array.length; i++) {
//            sum+=array[i];
//            if(sum<0) {
//                break;
//            }else {
//                System.out.println(array[i]);
//            }
//        }
        
    Scanner keyboard = new Scanner (System.in);      
        int value = 0;
        int total = 0;
        do
        {
            System.out.print("Enter some numbers: ");
            value = keyboard.nextInt();
            total = total + value;
            System.out.println("Your total are " + total);
        }
        while ( value > 0 );
    }
}
