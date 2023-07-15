import java.util.*;

public class _21_StreamAPI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> arr = new ArrayList<>();

        for(int i = 0; i < 6; i++){
            arr.add(sc.nextInt());
        }

        arr.stream()
                    .filter(n->n%2==1)
                    .sorted()
                    .map(n->n*2)
                    .forEach(n->System.out.println(n));

        // arr.forEach(n->System.out.println(n));
    }
}
