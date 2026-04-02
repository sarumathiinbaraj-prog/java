// abract class
abstract class SmartDevice{
     abstract void turnOn();
     abstract void turnOff();    
}
class Light extends SmartDevice{
    @Override
    void turnOn(){
        System.out.println("Light on");
    }
    @Override
    void turnOff(){
        System.out.println("Light off");
    }
}
public class Smart {
    public static void main(String[] args) {
        SmartDevice device=new Light();//object create only child class 
        device.turnOn();               //parent class just declare not eny 
    }
    
    
    
}
