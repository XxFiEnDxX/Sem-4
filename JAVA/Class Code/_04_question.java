import java.util.Scanner;
public class _04_question{
    public static void main(String[] args) {
        int a;
        String str;

        Scanner sc = new Scanner(System.in);
//        a = sc.nextInt();
        a= 10;
        str = (a%2==0)?"even":"odd";
        System.out.print(str);
    }
}