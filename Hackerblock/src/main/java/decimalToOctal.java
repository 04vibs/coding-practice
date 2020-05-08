import java.util.*;

public class decimalToOctal {

    public static void main(String args[]) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int decimalno = input.nextInt();
        
        System.out.println(decimalToOctalConverter(decimalno));
    }
    
    public static String decimalToOctalConverter(int num){
    String octal= "";  
    int rem=0;
    char octalchars[] = {'0','1','2','3','4','5','6','7'};
    while(num>0){
        rem = num%8;
        octal = octalchars[rem]+octal;
        num = num/8;
       }
    return octal;
    }
}
