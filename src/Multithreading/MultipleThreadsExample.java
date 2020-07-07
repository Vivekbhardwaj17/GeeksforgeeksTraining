package Multithreading;

public class MultipleThreadsExample implements Runnable {
    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        Thread thread2=new Thread(new MultipleThreadsExample());
        thread2.start();
        Thread thread1=new Thread(new MultipleThreadsExample());
        thread1.start();
        //MultipleThreadsExample ogj=new MultipleThreadsExample();
       // ogj.run();



    }//when first get cpu it got executed and when second got cpu it got executed that's why it output changed all time;
}
