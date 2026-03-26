package Day6;
class Notification{
    String name;
    String message;
    Notification(String name,String message){
        this.name=name;
        this.message=message;
    }

    void send(){
        System.out.println("Sending ");
    }
   
}
class EmailNotification extends Notification{
    EmailNotification(String name,String message){
        super(name,message);
    }
    @Override
    void send(){
        System.out.println("Sending Email to"+name);
        System.out.println("Message"+message);
    }
}
class SMSNotification extends Notification{
    SMSNotification(String name,String message){
        super(name,message);
    }
   @Override  // ithu potta error override agalanu sends la throu agum because send not sends nu
    void sends(){
        System.out.println("Sending SMS to"+name);
        System.out.println("Message"+message);
    }
}

public class Notify3 {
    public static void main(String[] args) {
        Notification n;
        n=new EmailNotification("aaa","order confirmed");//object create emailnotification
        n.send();
        n=new SMSNotification("bbb","OTP is 234");//object create SMSnotification
        n.send();
    }
}

