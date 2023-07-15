import java.util.*;

public class _03_Row_sumPrint {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int sum;
        for (int i = 0; i < arr.length; i++) {
            sum = 0;
            for (int j = 0; j < m; j++) {
                sum += arr[i][j];
            }
            System.out.print(sum+" ");
        }


    }
}
