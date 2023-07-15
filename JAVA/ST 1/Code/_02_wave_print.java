import java.util.*;
class _02_wave_print{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        // int[][] arr = new int[n][m];
        int arr[][] = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < m; i++) {
            if(i%2 == 0){
                for (int j = 0; j < n; j++) {
                    System.out.print(arr[j][i]+" ");
                }
            }else{
                for (int j = n-1; j >= 0; j--) {
                    System.out.print(arr[j][i]+" ");
                }
            }
        }

    }
}