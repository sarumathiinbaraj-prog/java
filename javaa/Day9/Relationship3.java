//battery-remote -composite relation
//remote-tv-aggregate re;lation
class Battery{
    public void powerSupply(){
        System.out.println("still have 40% power");
    }
}
class Remote{
    Battery miniBattery;
    Remote(){
        miniBattery=new Battery();
    }
    public void changechannel(){
        miniBattery.powerSupply();
        System.out.println("channel changed");
    }
    public void changeVolume(){
        System.out.println("volume increased");
    }

}
class Tv{
    Remote tvRemote;
    Tv(Remote tvRemote){
        this.tvRemote=tvRemote;
    }
    public void increaseVolume(){
        tvRemote.changeVolume();
    }
}
public class Relationship3 {
    public static void main(String[] args) {
        Remote sonyRemote=new Remote();
        Tv sony=new Tv(sonyRemote);
        sony.increaseVolume();
    }
}
