package Array;
import java.util.*;
import java.io.*;


public class stringLeftRightrotation {

    public static String leftRotate(String str,int d) {
        String ans = str.substring(d) + str.substring(0, d); 
        return ans;
        
    }
    
    
    public static String rightRotate(String str, int d) {
        return leftRotate(str, str.length() - d);
    }
    public static void main(String args[]) {
        // TODO code application logic here
        
        String str1 = "Hello world";
        System.out.print(leftRotate(str1,2));
        
        System.out.println(" ");
        String str2 = "Hello world";
        System.out.print(rightRotate(str2,2));
    }
}
