import java.util.*;
public class reverseInput {
    public static void main(String args[]) {
        // Your Code Here
		Scanner input = new Scanner(System.in);

		int num = input.nextInt();
		int rev=0;
		int temp;

		while(num!=0) {
			temp = num%10;
			rev = rev*10+temp;
			num=num/10;
		}
		System.out.println(rev);
    }
}
