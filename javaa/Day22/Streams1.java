import java.util.List;
class Employee{
    String name;
    int salary;
    Employee(String name,int salary){
        this.name=name;
        this.salary=salary;
    }
    public String getName(){return name;}
    public int getSalary(){return salary;}
    @Override
    public String toString(){
        return name+" "+salary;
    }

}
public class Streams1
 {
    public static void main(String[] args) {
        //map
        List<Integer>nums=List.of(2,3,4,5,6);
        List<Integer>multyplyBy2=nums.stream().map((i)->i*2).toList();
        System.out.println(multyplyBy2);
        //even number using filter function
        List<Integer>even=nums.stream().filter((i)->i%2==0).toList();
        System.out.println(even);
        int total=even.stream().reduce(0, (a,b)->a+b);
        System.out.println(total);
        //obj
        List<Employee>employees=List.of(new Employee("e1",2222),new Employee("e2",3333));
        List<String>names=employees.stream().map((i)->i.getName()).toList();
        System.out.println(names);
        List<Employee>greaterSalary=employees.stream().filter((i)->i.getSalary()>3000).toList();
        System.out.println("After filter"+greaterSalary.toString());
    }
}
