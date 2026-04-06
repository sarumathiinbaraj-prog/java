

public class Wrapper {
    public static Integer test1(String s){
        return Integer.valueOf(s);
    }
    public static void main(String[] args) {
        Integer b=Integer.valueOf("12345");//return type->object(Integer)
        Integer c=Integer.parseInt("12345");//return type->int(int)
        int a=b;//unboxing
        boolean x=(b==c);
        System.out.println(x);//false becase 12345>128(Integer range -128 to 127 does not create new object)
        System.out.println(a);
        System.out.println(c);
        System.out.println(test1("123"));
    }
}
