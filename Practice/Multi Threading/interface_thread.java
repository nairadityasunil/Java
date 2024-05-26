class Thread1 implements Runnable{
    public void run()
    {
        for(int i =0 ;i<10 ;i++)
        {
            System.out.println(i);
        }
    }
}

class Thread2 implements Runnable{
    public void run()
    {
        for(int i =10 ;i<20 ;i++)
        {
            System.out.println(i);
        }
    }
}

public class interface_thread{
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();

        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);

        thread1.start();
        thread2.start();
    }
}
