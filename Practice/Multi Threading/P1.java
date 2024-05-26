// Multithreading by extending thread class

// Class having thread in it
class Thread_body extends Thread
{
    // Overriding run method of thread class
    public void run()
    {
        try
        {
            for(int i =1;i<=10;i++)
            {
                System.out.println(i);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}

class Thread_body1 extends Thread
{
    // Overriding run method of thread class
    public void run()
    {
        try
        {
            for(int i =11;i<=20;i++)
            {
                System.out.println(i);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}

class Thread_body2 extends Thread
{
    // Overriding run method of thread class
    public void run()
    {
        try
        {
            for(int i =21;i<=30;i++)
            {
                System.out.println(i);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}


public class P1
{
    public static void main(String args[]) 
    {
        Thread_body thread1 = new Thread_body();
        Thread_body1 thread2 = new Thread_body1();
        Thread_body2 thread3 = new Thread_body2();

        try
        {
            
            thread1.start();
            // thread1.join();
            thread2.start();
            thread3.start();
            thread1.setPriority(6);
            thread2.setPriority(3);
            thread3.setPriority(1);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }

        System.out.println("Thread Name : "+thread1.getName()+" Priority "+thread1.getPriority());
        System.out.println("Thread Name : "+thread2.getName()+" Priority "+thread2.getPriority());
        System.out.println("Thread Name : "+thread3.getName()+" Priority "+thread3.getPriority());

    }
}