import java.util.Scanner;
public class _06_question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int j;
        n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            j = Math.abs(arr[i]) - 1;

            if (arr[j] < 0) {
                System.out.print(Math.abs(arr[i])+" ");
            }

            else{
                arr[j] = -arr[j];
            }
        }

    }
}
