import java.util.*;

public class quadraticeqn {

    public static void main(String args[]) {
        // TODO code application logic here
        System.out.println("Hello world");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        double r1;
        double r2;
        int discriminant;
        discriminant= (b*b -4*a*c);
        System.out.println(discriminant);
        
        if(discriminant > 0) {
            r1 = (int)((-b + Math.pow(discriminant,0.5))/2*a) ;
            r2 = (int)((-b - Math.pow(discriminant,0.5))/2*a) ;
            System.out.println("Real and Distinct");
            if(r1>r2){
                System.out.print((int)r2 + " "+ (int)r1);
            }
            else{
            System.out.print((int)r1 + " "+ (int)r2);
            }
            
        } else if(discriminant == 0){
            r1 = (-b/2*a);
            System.out.println("Real and Equal");
            System.out.print((int)r1 + " "+ (int)r1);
        }
        else{
            System.out.println("Imaginary");
        }   
    }
}
