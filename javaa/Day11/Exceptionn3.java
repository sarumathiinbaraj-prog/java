public class Exceptionn3 {
    public static void main(String[] args) {
        Thread T=new Thread(()->{
            try {
                System.out.println("Thread sleep");
                Thread.sleep(2000);
                System.out.println("thread wake");
            } catch (InterruptedException e) {
                System.out.println("sleep interrupted");
            }
        });
        T.start();
        try{
            Thread.sleep(6000);
            System.out.println("main method thread");
        }catch(InterruptedException e){
            System.out.println("Not T");
        }
        T.interrupt();
    }
}
