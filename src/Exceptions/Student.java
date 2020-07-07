package Exceptions;

public class Student {
  public static void checkStudentAge(int age){
      if(age>125){
          throw new ArithmeticException(" Too big age ");

      }
      else System.out.println("Valid age");
  }

    public static void main(String[] args) {
        checkStudentAge(45);
        checkStudentAge(125);
        checkStudentAge(150);

    }
}
