//fuctional interface - only one fuction allowed
//lambda function - only work in functional interface
@FunctionalInterface
interface Math{//-not alloved more fuction ex-Sub(int a,int b) not allowed for functional Interface
    int add(int a,int b);
}
@FunctionalInterface
interface Exercise{
    void sayHello();
}
public class LambdaFuction1{
    public static void main(String[] args){
        // Math obj=new Math(){
        //     @Override
        //     public int add(int a,int b){
        //         return a+b;
        //     }
        // };
        //Lambda fuction-also called ananimas function
        //Math obj=(a,b)->a+b;
        //System.out.println(obj.add(11,22));
        Math obj=(a,b)->{
            System.out.println("Adding two numbers...");
            return a+b;
        };
        System.out.println(obj.add(11,22));
        Exercise ex=()->System.out.println("hello wold");
        ex.sayHello();
    }

}