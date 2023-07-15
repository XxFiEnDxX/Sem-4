import java.util.Scanner;

public class _05_user_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int num = sc.nextInt();
        Float f = sc.nextFloat();

        System.out.print(str+num+f);
    }
}
