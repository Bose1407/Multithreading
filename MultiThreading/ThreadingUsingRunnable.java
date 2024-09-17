package MultiThreading;

class Some implements Runnable{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Some1 implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


public class ThreadingUsingRunnable{
    public static void main(String[] args) throws InterruptedException {

        Some obj = new Some();
        Some1 obj1 = new Some1();
        
        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj1);

        Runnable obj3 = ()->{
            for(int i=1;i<5;i++){
                System.out.println("thread "+i);
            }
        };

        Thread t3 = new Thread(obj3);

        Thread t4 = new Thread(() -> {
            for (int i = 1; i < 5; i++) {
                System.out.println("thread " + i);
            }
        });


        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Thread Name is : " + t3.getName());
        t3.start();
        
    }
}