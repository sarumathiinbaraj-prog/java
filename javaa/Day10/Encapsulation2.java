
class LockerSystem{
    private int lockerId;
    private boolean isLocked;
    private int pinCode;
    private String storedItem;
    LockerSystem(int lockerId,int pinCode){
        this.lockerId=lockerId;
        this.pinCode=pinCode;
        isLocked=true;
    }
    public void storeItem(String item,int pin){
        if(pin==pinCode){
            if(!isLocked){
                storedItem=item;
                System.out.println("stored successfully");
            }else{
                System.out.println("Loker is loked");
            }
        }else{
            System.out.println("Entered pin is wrong");
        }
    }
    public void retrieveItem(int pin){
        if(pin==pinCode){
            if(!isLocked && storedItem!=null){
                System.out.println("Retrieved Item"+storedItem);
                storedItem=null;
            }else if(storedItem==null){
                System.out.println("Locker is empty");
            }else{
                System.out.println("Locker is locked");
            }

        }else{
            System.out.println("pin is wrong");
        }
    }
    public void unlock(int pin){
        if(pin==pinCode){
            isLocked=false;
            System.out.println("Locker unlocked");
        }else{
            System.out.println("wrong pin");
        }

    }
    public void lock(){
        isLocked=true;
    }
    
    
}
public class Encapsulation2 {
    public static void main(String[] args) {
        LockerSystem l=new LockerSystem(1,12345);
        l.unlock(12345);
        l.storeItem("bag", 12345);
        l.retrieveItem(12345);
        l.lock();
    }

    
}
