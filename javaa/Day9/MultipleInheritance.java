

interface Remote{
    void change();
}
interface WifiControl{
    void connect();
}
class TV implements Remote,WifiControl{
    @Override
    public void change(){// public not use error for default 
        System.out.println("change channel");
    }
    @Override
    public void connect(){
        System.out.println("wifi connected");
    }

}

public class MultipleInheritance {
    public static void main(String[] args) {
        Remote r=new TV();
        r.change();
        WifiControl w=new TV();
        w.connect();
    }  
    
}
