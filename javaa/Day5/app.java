package Day5;
 
class User{  //parent class
    String name;
    String phoneno;
    String address;
    String role="User";
    User(){ //constructor
        System.out.println("by using super");
    }
    User(String name){  //constructor== same as class name
        this.name=name;
        System.out.println("User created");
    }
    void display(){
        System.out.println("Name:"+name);
        System.out.println("role:"+role);
    }
}
// class FoodUser extends User{
//     String favouriteFood;
//     FoodUser(){
//         System.out.println("food user created");
//     }  
// }
// class TravelUser extends User{
//     String preferredVehicle;
 
//}
class Driver extends User{
    String role="Driver";
    String vehicle;
    Driver(String name,String vehicle){ 
        super(name);
        this.vehicle=vehicle;
        System.out.println("Name:"+name);
        System.out.println("Role:"+role);//Role:Driver
        System.out.println("Role:"+super.role);//Role:User parent class
        System.out.println("Vehicle:"+vehicle);
    }
}
public class app {
    public static void main(String[] args) {
       Driver d=new Driver("ABC","bike");
    }
    
}
