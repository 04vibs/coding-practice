/* full pyramid
        *
      * * *
    * * * * *
  * * * * * * *
* * * * * * * * *
 */
public class pattern6 {

    public static void main(String args[]) {
        // TODO code application logic heres
        System.out.println("Hello world");
        for(int i=1;i<=5;i++){
            for(int j=1;j<=(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
       }
}
