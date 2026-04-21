import java.util.function.Predicate;
class Student{
    int mark;
    Student(int mark){
        this.mark=mark;
    }
}
public class Predicate1{
    public static void main(String[] args){
        // Predicate<Integer>isEven=nre Predicate<Integer>(){
        //     public boolean test(Integer n){
        //         return n%2==0;
        //     }
        // };
        //lambda function
        Predicate<Integer>isEven=(n)->n%2==0;
        System.out.println(isEven.test(9999));
        Predicate<Integer>isOdd=isEven.negate();
        Predicate<Student>isPass=(s)->s.mark>40;
        System.out.println(isPass.test(new Student(45)));

    }
}