import java.util.*;
public class checkprime {
    public static void main(String args[]){
        // TODO code application logic here
        System.out.print("Hello world");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if(checkprimeno(number)){
        System.out.print("Prime");
        } else {
            System.out.println("");
        System.out.print("Not Prime");
        }
    }

    public static boolean checkprimeno(int num) {   
    if(num<=1) {
    return false;
    } else {
    for(int i=2;i<Math.sqrt(num);i++) {
        if(num % i==0) {
            return false;
            }
        }
    return true;
    }
    }
}
