//interface class

interface Remote{
    void change();
}
class TV implements Remote{
    @Override
    public void change(){// public not use error for default 
        System.out.println("change channel");
    }

}

public class Smart3 {
    public static void main(String[] args) {
        Remote r=new TV();
        r.change();
    }  
    
}
