public class _02_string {
    public static void main(String[] args) {
        String name = "bob";
        String blank = " ";
        String word = "hello";

        String greet = word + blank + name;

        System.out.println(greet);

        int a = 10;
        int b = 90;
    
        System.out.println(a + b + word);  //hell0100
        System.out.println(word + a + b); //hello1090

        //express solved left ot right manner;
    }
}
