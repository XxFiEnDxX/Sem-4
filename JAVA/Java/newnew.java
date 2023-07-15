import java.util.*;

public class newnew {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);


        //Array
        int arr1[] = new int[100];
        // arr1[0] = 1;
        // arr1[1] = 2;

        // System.out.println(arr1[0]);
        // System.out.println(arr1[1]);

        // 5 -> n
        // 4 5 6 7 8
        // int n = sc.nextInt();

        // for (int i = 0; i < n; i++) {
        //     arr1[i] = sc.nextInt();
        // }

        // for (int i = 0; i < n; i++) {
        //     System.out.print(arr1[i]+" ");
        // }



        //ArrayList
        ArrayList<Integer> arr2 = new ArrayList<Integer>();
        // arr2.add(1);
        // arr2.add(2);
        // System.out.println(arr2.get(0));
        // System.out.println(arr2.get(1));

        int a = sc.nextInt();
        for (int i=0;i<a;i++){
            arr2.add(sc.nextInt());
        }
        for(int i=0;i<a;i++){
            System.out.print(arr2.get(i)+" ");
        }

    }
}
