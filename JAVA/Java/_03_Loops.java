public class _03_Loops {
    public static void main(String[] args) {

        // while
        int val = 0;
        while (val < 5) {
            System.out.print(val+" ");
            val++;
        }
        
        System.out.println();
        
        // for
        for (int i = 0; i < 5; i++) {
            System.out.printf("the val of i is %d \n", i);
        }
        
        // do while
        do {
            System.out.print(val+" ");
            val--;
        } while (val > 0);
    }
}
