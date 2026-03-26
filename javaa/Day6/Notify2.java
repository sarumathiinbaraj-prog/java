package Day6;
class Notification{
    void send(){
        System.out.println("Sending ");
    }
   
}
class EmailNotification extends Notification{
    void send(){
        System.out.println("Sending Email Notification");
    }
    void ChangeReceiverEmail(){

    }
}
class SMSNotification extends Notification{
    void send(){
        System.out.println("Sending SMS Notification");
    }
}

public class Notify2 {
    public static void main(String[] args) {
        Notification n=new EmailNotification();//object create emailnotification based reference parent class
        n.send();
        n.ChangeReceiverEmail();//error -parent class la declar pannala so object create emailnotification only 
        // EmailNotification n=new EmailNotification();--remove error
    }
}

