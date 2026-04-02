//has a relationshi-composition
class Battery{
    public void powerSupply(){
        System.out.println("still have 40% power");
    }
}
class Remote{
    Battery miniBattery;//has a relationship-composite(constructor use)
    Remote(){
        miniBattery=new Battery();
    }
    public void changechannel(){
        miniBattery.powerSupply();
        System.out.println("channel changed");
    }

}
public class Relationship2 {
    public static void main(String[] args) {
        Remote tvRemote=new Remote();
        tvRemote.changechannel();
    }
}
