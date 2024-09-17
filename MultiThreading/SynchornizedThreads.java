package MultiThreading;

class JeemDabakuDum implements Runnable{

    private int counter = 0;

    synchronized void  increment() {

        for(int i = 0;i<10000;i++){
            counter = counter + 1;
        }

    }

    int getIncrementedValue() {
        return counter;

    }

    public void run(){
        increment();
    }
}

public class SynchornizedThreads {
    public static void main(String[] args) throws InterruptedException {

        JeemDabakuDum obj = new JeemDabakuDum();
        JeemDabakuDum obj1 = new JeemDabakuDum();

        Thread t1 = new Thread(obj,"First Thread");
        Thread t2 = new Thread(obj,"Second  Thread");

        t1.start();

        t2.start();

        t1.join();

        System.out.println(obj.getIncrementedValue());
        
        t2.join();

        System.out.println(obj.getIncrementedValue());
        
    }
}
