 
    public static void leftrotate(int arr[], int d, int n) {
        for(int i=0; i<d ; i++) {
        leftRotateByOne(arr,n);
        }
    }   

    public static void leftRotateByOne(int arr[],int d){
        int temp =arr[0];
        int j;
        for(j=0; j<d-1; j++) {
            arr[j] = arr[j+1];
        }
        arr[j] = temp;
    }
    public static void printarray(int arr[], int n) {
        for(int k=0; k<n;k++) {
            System.out.print(arr[k]+ " ");
        }
    }

    public static void main(String[] args) {
        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }
        leftrotate(a,d,n);
        printarray(a,n);
        scanner.close();
    }