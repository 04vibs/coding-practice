/* inverted pyramid
********* 
******* 
***** 
*** 
* 
 
*/
public class pattern7 {

    public static void main(String args[]) {
        // TODO code application logic here
        System.out.println("Hello world");
        for(int i=5;i>=1;i--){
            for(int j=1;j<=(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
