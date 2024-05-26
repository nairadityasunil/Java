class Table
{
    String n;
    Table(String n)
    {
        this.n = n;
    }
    synchronized void printTable()
    {
        // for(int i=1;i<=5;i++)
        // {
        //     System.out.println(this.n*i);
        // }
        System.out.println(this.n);
    }
}

class Thread1 extends Thread
{
    Table t = new Table("Thread 1");
    public void run()
    {
        t.printTable();
    }
}

class Thread2 extends Thread
{
    Table t = new Table("Thread 2");
    public void run()
    {
        t.printTable();
    }
}

class Thread3 extends Thread
{
    Table t = new Table("Thread 3");
    public void run()
    {
        t.printTable();
    }
}

public class P2
{
    public static void main(String args[])throws InterruptedException
    {
        // Table obj = new Table();
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        Thread3 t3 = new Thread3();
        t1.start();
        t1.join();
        t2.start();
        t3.start();
    }
}