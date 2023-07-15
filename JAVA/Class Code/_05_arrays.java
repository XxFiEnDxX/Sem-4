public class _05_arrays {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int b[] = new int[5];

        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]+" ");
        }

        System.out.println( );
        
        for (int i : arr) {
            System.out.print(i+" ");
        }
        
        System.out.println( );

        int arr2d[][] = {{1,2},{3,4}};
        int b2[][] = new int[3][2];

        for (int[] is : arr2d) {
            for (int is2 : is) {
                System.out.print(is2+" ");
            }
            System.out.println();
        }
        


    }
}
