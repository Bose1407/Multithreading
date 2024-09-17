package MultiThreading;


class Example extends Thread{

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

public class MultiThread {
    public static void main(String[] args) {
        Example t1 = new Example();
        Example t2 = new Example();

        t1.start();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
    }
}
