public class _13_throw {
    public static void main(String[] args) {
        try{
            Exception obj = new Exception("Hello");
            throw obj;
            // throw new Exception();
        }
        catch(Exception e){
            System.out.print(e);
        }
    }
}
