//has a relationship-1.compositipon
class Battery{
    public void powerSupply(){
        System.out.println("still have 40% power");
    }
}
class Remote{
    Battery miniBattery=new Battery();
    public void changechannel(){
        miniBattery.powerSupply();
        System.out.println("channel changed");
    }

}
public class Relationship {
    public static void main(String[] args) {
        Remote tvRemote=new Remote();
        tvRemote.changechannel();
    }
}
