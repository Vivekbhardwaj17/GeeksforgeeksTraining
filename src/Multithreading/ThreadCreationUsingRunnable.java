package Multithreading;

public class ThreadCreationUsingRunnable implements Runnable{
    @Override
    public void run(){
        System.out.println("this is overrided method:");
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        ThreadCreationUsingRunnable obj2=new ThreadCreationUsingRunnable();// no start preset in Runnable
        ThreadCreationUsingRunnable obj =new ThreadCreationUsingRunnable();
        Thread o=new Thread(obj);
        o.start();
Thread thrd=new Thread(obj2);
thrd.run();



    }
}
