import java.util.Scanner;

public class _06_switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        switch (str) {
            case "hello":
                System.out.println("hello");
                break;
            default:
                System.out.println("Default");
                break;
        }

    }
}
