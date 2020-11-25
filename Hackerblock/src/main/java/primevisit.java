import java.io.*;
// import java.util.*;
public class primevisit {
    public static void main(String args[]) throws IOException {
        // TODO code application logic here
        //Scanner input = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new
        InputStreamReader(System.in));
        int testcases = Integer.parseInt(br.readLine());
       // int testcases = input.nextInt();
        while(testcases != 0) {
//            int start = input.nextInt();
//            int end = input.nextInt();
            int start = Integer.parseInt(br.readLine());
            int end = Integer.parseInt(br.readLine());
            int count = 0;
        
            
            while(start != end) {
             if(checkPrime(start)) {
            count = count + 1;
            }
             start++;
            }
        
            System.out.println(count);
        testcases--;
        }
        
       
    } 
    public static boolean checkPrime(int num) {
        
        if(num <=1) {
            return false;
        }
        for(int i=2;i<=Math.sqrt(num);i++) {
            if(num % i  == 0) {
            return false;
            } 
            System.out.println(num);
        }
        return true;
    }
}
