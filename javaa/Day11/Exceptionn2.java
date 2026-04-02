public class Exceptionn2{
    public static void main(String[] args) {
        try {
           String s=null;
           System.out.println(s.length());
        } catch(ArithmeticException e){
            System.out.println("Number is divided by zero");
        }
        catch (Exception e) {
            System.err.println(e);
        }finally{
            System.out.println("Finally block always execute");
        }
    }
}