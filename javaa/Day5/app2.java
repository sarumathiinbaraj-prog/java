package Day5;
 
class User{  
    String name;
    String phoneno;
    String location;
    String role="User";
    User(){ 
        System.out.println("by using super");
    }
    User(String name){  
        this.name=name;
        System.out.println("User created");
    }
    void display(){
        System.out.println("Name:"+name);
        
    }
}
class FoodUser extends User{
    String favouriteFood;
    FoodUser(){
        System.out.println("food user created");
    }  
}
class ParecelUser extends User{
    String WeigthString;

 
}
class RideUser extends User{
    
    String vehicletype;
    RideUser(String name,String vehicletype){
        super(name);
        this.vehicletype=vehicletype;
        System.err.println("Name:"+name);
        System.err.println("Vehicletype:"+vehicletype);

    }


}
public class app2 {
    public static void main(String[] args) {
       RideUser n=new RideUser("aaa","bike");
    }
    
}
