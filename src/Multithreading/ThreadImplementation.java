package Multithreading;

public class ThreadImplementation extends Thread {
    @Override
    public void  run(){
        System.out.println("Inside run of ThreadCreationDemoUsingThread");
        System.out.println("Thread name:"+Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        ThreadImplementation obj=new ThreadImplementation();
        obj.start();
    }

}
//for creating new thread use start()
//jvm makes main thread