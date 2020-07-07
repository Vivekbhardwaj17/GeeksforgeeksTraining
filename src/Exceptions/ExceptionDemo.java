package Exceptions;

public class ExceptionDemo {
//    public double divide(int a, int b) {
//        return a / b;
//    }

    public static void main(String[] args)throws Exception {
//        try {
//            ExceptionDemo obj = new ExceptionDemo();
//            System.out.println(obj.divide(4, 0));
//        } catch (Exception e) {
//            System.out.println("Error occured");
//        }
        int a[] = new int[4];
        try {
            a[4] = 20 / 4;
        }
//        catch(ArrayIndexOutOfBoundsException e){
//            System.out.println(e);
//        }
//        catch(ArithmeticException e)
//        {
//            System.out.println(e);
//        }

//        catch(ArrayIndexOutOfBoundsException | ArithmeticException e){
//            System.out.println(e);
//        }
//        catch(Exception e){
//            System.out.println(e);
//        }
        finally{
            System.out.println("this is finally");
        }
    }
}
