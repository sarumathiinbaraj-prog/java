//extends-run method
class SampleThread extends Thread{
    @Override
    public void run(){
        System.out.println("thread running using thread class");
    }
}
//implements-runnable method
class SampleThread2 implements Runnable{
    @Override
    public void run(){//3.RUNNING STATE
        try {
            System.out.println("thread running using runnable");
            Thread.sleep(400);//4.BLOCKED/WAITING STATE
            System.out.print("After 4 seconds");
        } catch (Exception e) {
            System.out.println(e);
        }
        
        
    }
}
public class Thread2 {
    public static void main(String[] args) {
        //run
        SampleThread t= new SampleThread();
        t.start();
        //runnable
        SampleThread2 s=new SampleThread2();
        Thread t2=new Thread(s);//1.NEW STATE
        t2.start();//2.RUNNABLE STATE
    }
}
//direct colling run()->act as normal function
//start()->initialize thread it will call run() internally