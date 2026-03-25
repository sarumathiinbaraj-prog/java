package Day3;
public class method2 {
    static void change(int x){
        x=20;
        System.out.println("inside method:"+x);//just print not return so not change original value functipon kulla mattum change agum
    }
    public static void main(String[] args) {
        int x=50;//primitive data type int so return panna tha change agum
        change(x);
        System.out.print("outside method:"+x);
    }
    
}
