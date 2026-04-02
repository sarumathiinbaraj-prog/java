class OutOfStackException extends Exception{//use extends runException also 
    public OutOfStackException(String msg){
        super(msg);
    }
}
class PaymentFailException extends Exception{
    public PaymentFailException(String msg){
        super(msg);
    }
}
class OrderFailException extends Exception{ 
    public OrderFailException(String msg){
        super(msg);
    }
}
class Product{
    String name;
    int order;
    int price;
    Product(String name,int order,int price){
        this.name=name;
        this.order=order;
        this.price=price;
    }
    
}

class User{
    String name;
    String address;
    User(String name,String address){
        this.name=name;
        this.address=address;
    }
    
}
class Order{
    Product product;
    User user;
    int quantity;
    Order(String name,int order,int price){
        this.name=name;
        this.order=order;
        this.price=price;
    }
    
}
public class Exceptionn5 {
    public static void main(String[] args) {
        
    }
}
