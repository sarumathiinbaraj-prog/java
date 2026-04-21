class Bank{
    int balance=1000;
    synchronized void withdraw(int amount){//use synchcronized remove negative value limit back balnce not go to negative
        if(amount<=balance){
            System.out.println("Amount withdraw successfully");
            balance-=amount;
            System.out.println("Remaining balance:"+balance);
        }else{
            System.out.print("Insufficient balence");
        }
    }
}
class BankThread extends Thread{
    Bank bank;
    BankThread(Bank bank){
        this.bank=bank;
    }
    public void run(){
        bank.withdraw(800);
    }

}
public class Synchcronization1 {
    public static void main(String[] args) {
        Bank b=new Bank();
        BankThread b1=new BankThread(b);
        BankThread b2=new BankThread(b);
        b1.start();
        b2.start();
    }
}
