import java.util.*;

public class _09_classCode{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;
        int cmax = -1;

        for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 1) {
                    count++;
                    if(count > cmax){
                        cmax = count;
                    }
                }   
                else{
                    count = 0;
                }
        }

        System.out.print(cmax);
    }
}