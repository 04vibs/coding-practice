import java.util.*;
public class binaryToDecimal {

    public static void main(String args[]) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();
        while(testcase>0) {
            int binaryno = input.nextInt();
            System.out.println(binaryToDecimalConverter(binaryno));
            testcase--;
        }
        
    }
    
    public static int binaryToDecimalConverter(int number){
        int decimal = 0;
        int power =0;
        
        while(true){
        if(number == 0) {
        break;
        } else {
            int temp = number%10;
            decimal += temp*Math.pow(2,power);
            number = number/10;
            power++;
        }
      }
         return decimal;
    } 
}
