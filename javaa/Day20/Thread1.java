

public class Thread1 {
    public static void main(String[] args) {
        task1();
        task2();
    }
    static void task1(){
        for(int i=0;i<5;i++){
            System.out.println("from task 1:"+i);
        }
    }
    static void task2(){
        for(int i=0;i<5;i++){
            System.out.println("from task 2:"+i);
        }
    }
}
