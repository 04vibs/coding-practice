import java.util.*;
public class superpow {
    public static void main(String args[]) {
        // TODO code application logic here
        System.out.println("Hello world");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        double result = Math.pow(num1, num2);
        
        System.out.println((int)result);
    }
}
