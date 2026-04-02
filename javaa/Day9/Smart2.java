abstract class SmartDevice{
     abstract void turnOn();
     abstract void turnOff();   
     void deviceInfo(){//concrete method
        System.out.print("it is a device");
     } 
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
public class Smart2 {
    public static void main(String[] args) {
        SmartDevice device=new Light();//object create only child class 
        device.turnOn();               //parent class just declare not eny 
        device.deviceInfo();
    }
    
    
    
}
