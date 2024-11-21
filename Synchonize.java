import java.util.*;
//
//class Bus implements Runnable{
//
//    int available=3;
//    int passenger;
//
//
//    Bus(int passenger){
//        this.passenger=passenger;
//    }
//
//    @Override
//    public synchronized void run(){
//        String name=Thread.currentThread().getName();
//        System.out.println(passenger);
//        if(available>=passenger){
//            System.out.println(name+" reserved seat");
//            available--;
//        }
//        else{
//            System.out.println("Sorry seat not available");
//        }
//    }
//}


class Bank extends Thread{
    //String name;
    int bal=5000;
    int withdraw;
    Bank(int withdraw){
      this.withdraw=withdraw;
    }
    public synchronized void run () {
        /*synchronized (this) {
//        public void run () {
            for (int i = 1; i <= 3; i++) {
                System.out.println("Hello " + name);
            }*/
//    }
        if(bal>=withdraw){
            System.out.println(Thread.currentThread().getName()+" "+"withdraws");
            bal=bal-withdraw;
        }
        else{
            System.out.println("Insuffient balance");
        }
    }

}

public class Synchonize {
    public static void main(String[] args){
//        Bus r=new Bus(1);
//        Thread t1=new Thread(r);
//        Thread t2=new Thread(r);
//        Thread t3=new Thread(r);
//
//        t1.start();
//        t2.start();
//        t3.start();
//        Bank obj=new Bank(5000); //every object has one lock
//        Thread t1=new Thread(obj);
//        Thread t2=new Thread(obj);


        // obj1-t1,t2



    }
}
