public class Main {
    public static void main(String args[]) {
        System.out.println("Hello World!");
        int arr[] ={12,14,3,5,7};
        bublesort(arr);
        printArray(arr);
        System.out.print("Thanks");
    }
    public static void bublesort(int[] arr) {
        int i,j;
        for( i=0;i<arr.length;i++){
             System.out.print(":Inside bubble sort");
            for( j=0;j<arr.length-i-1;j++){               
                if(arr[j]>arr[j+1]){                    
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;       
              }
            }
        }
    }
    
  public static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 

}