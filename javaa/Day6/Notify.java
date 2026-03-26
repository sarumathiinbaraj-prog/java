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
}
class SMSNotification extends Notification{
    void send(){
        System.out.println("Sending SMS Notification");
    }
}

public class Notify {
    public static void main(String[] args) {
        Notification n=new EmailNotification();//object create emailnotification based parent class
        n.send();
        n=new SMSNotification();//object create SMSnotification
        n.send();
    }
}

