import java.util.function.Consumer;
import java.util.List;
class Student{
    String name;
    Student(String name){
        this.name=name;
    }
}
public class Consumer1{
    public static void main(String[] args){
        Consumer<String>printString=(s)->System.out.println(s);
        printString.accept("From consumer");
        Consumer<Student>printName=(s)->System.out.println(s.name);
        printName.accept(new Student("anu"));
        List<String>names=List.of("aaa","bbb","ccc");
        names.forEach(name->System.out.println(name));
        //shortcut for lambda function
        names.forEach(System.out::println);
    }
}