/* pattern
1
12
123
1234
12345
*/
public class pattern1 {

    public static void main(String args[]) {
        // TODO code application logic here
        System.out.println("hello World");
        
        for(int i=1;i<=5;i++) {
            for(int k=1; k<=(5-i);k++) {
            System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
            System.out.print(j);
            }
            System.out.println("");
          
        }
        
        System.out.println("");
        for(int i=1;i<=5;i++) {
            for(int j=1;j<=i;j++){
            System.out.print(j);
            }
            System.out.println(" ");
        }
    }
}
