
import java.util.function.Supplier;
class Person{
    String name="Supplier";
}
public class Supplier1{
    public static void main(String[] args) {
        Supplier<Integer>s=()->(int)(Math.random()*100);//random integer get
        System.out.println(s.get());
        Supplier<Person>p=()->new Person();
        System.out.println(p.get().name);
    }
}