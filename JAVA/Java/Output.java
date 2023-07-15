import java.util.*;

public class Output {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    ArrayList<Integer> arr1 = new ArrayList<>();
    ArrayList<Integer> arr2 = new ArrayList<>();

    for (int i = 0; i < n; i++) {
      arr1.add(sc.nextInt());
    }

    int b = sc.nextInt();
    for (int i = 0; i < b; i++) {
      arr2.add(sc.nextInt());
    }

    arr1.addAll(arr2);
    Collections.sort(arr1);

    for (int i = 0; i < arr1.size(); i++) {
      
        System.out.print(arr1.get(i)+" ");
    }
  }
}