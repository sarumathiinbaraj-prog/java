// comparable class kullaye defind pannuvom so id vachi name vachi sort panna mudiyathu(only one)
//comparable-use compareTo mathod
import java.util.*;
class Student implements Comparable<Student>{
    String name;
    int mark;        
    Student(String name,int mark){
        this.name=name;
        this.mark=mark;
    }
    @Override
    public int compareTo(Student s){
        return this.mark-s.mark;//s.mark-this.mark-decending order

    }
    @Override
    public String toString(){
        return name+"-"+mark;
    }

}
public class Comparable1 {
    public static void main(String[] args) {
        List<Student> s=new ArrayList<>();
        s.add(new Student("A",70));
        s.add(new Student("B",55));
        s.add(new Student("C",85));
        s.add(new Student("D",60));
        Collections.sort(s);//collection means list
        // for(Student a:s){
        //     System.out.println(a.name+"-"+a.mark);
        // }
        System.out.print(s);
    }
}
