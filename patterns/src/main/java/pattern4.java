/*
1 2 3 4 5
1 2 3 4 
1 2 3
1 2
1
 */
public class pattern4 {
    public static void main(String args[]) {
        // TODO code application logic here
         System.out.println("hello World");
        for(int i=5;i>=1;i--) {
            
           //spaces
            for(int k=1;k<=(5-i);k++){
                System.out.print(" ");
            }
            
            // num
            for(int j=i;j>=1;j--){
            System.out.print(j);
            }
            System.out.println(" ");
    }
        
//         for(i=N; i>=1; i--)
//    {
//        // Logic to print numbers
//        for(j=i; j>=1; j--)
//        {
//            printf("%d", j);
//        }
//
//        printf("\n");
//    }

        
         for(int i=5;i>=1;i--) {
            for(int j=1;j<=i;j++){
            System.out.print(j);
            }
            System.out.println(" ");
    }
}
}
