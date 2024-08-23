package thread;

public class myClass {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0;i<4; i++)
        {
            System.out.println(Thread.currentThread().getName());
        }

        mythread t1=new mythread();

        t1.join();
        t1.start();
        System.out.println(Thread.currentThread().getName());

    }
}

class mythread extends Thread{
    @Override
    public void run() {
        super.run();
        for (int i=0; i<3; i++){
            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


        }
    }
}
