
abstract class Smartdevice{
    abstract void turnOn();
    abstract void turnOff();
}
class Light extends Smartdevice{
    @Override
    void turnOn(){
        System.out.println("Light on");
    }
    void turnOff(){
        System.out.println("Light off");
    }

}
class Ac extends Smartdevice{
    @Override
    void turnOn(){
       System.out.println("Ac on");
    }
    void turnOff(){
       System.out.println("Ac off");
    } 
}
interface Trigger{
    public boolean isTriggered();
}
class motionTrigger implements Trigger{
    public boolean isTriggered(){
       System.out.print("motion Trigger");
       return true;
    }
}
class tempTrigger implements Trigger{
    public boolean isTriggered(){
        System.out.print("temp trigger");
        return true;
    }   
}
class TimeTrigger implements Trigger{
    public boolean isTriggered(){
        System.out.print("time Trigger");
        return true;
    }
}
interface Action{
    void execute();
}
class TurnOnAction implements Action{
    Smartdevice device;

    public TurnOnAction(Smartdevice divice) {
        this.device=device;
    }
    public void execute(){
        device.turnOn();
    }
}
class TurnOffAction implements Action{
    Smartdevice device;

    public TurnOffAction(Smartdevice divice) {
        this.device=device;
    }
    public void execute(){
        device.turnOff();
    }
}
class Link{
    Trigger trigger;
    Action action;
    Link(Trigger trigger,Action action ){
        this.trigger=trigger;
        this.action=action;
    }
    void result(){
        if(trigger.isTrigger()){
            action.execute();
        }else{
            System.out.print("trigger condition not match");
        }
    }
}
public class SmartHome {
    public static void main(String[] args) {
        
        link r1=new Link()
    }
}
