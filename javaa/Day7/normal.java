
class Calculator{
    int add(int n1,int n2){
        return n1+n2;
    }
    int addThreeNumber(int n1,int n2,int n3){
        return n1+n2+n3;
    }
    double addDcimalNumber(double n1,double n2){
        return n1+n2;
    }
}

public class normal {
    public static void main(String[] args) {
        Calculator c=new Calculator();
        System.err.println(c.add(2,3));
        
    }
}
