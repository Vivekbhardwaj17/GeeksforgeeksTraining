package Inheritance;

public class Mainclass {
    public static void main(String[] args) {


    Baseclass bs=new Baseclass("hero","bike",2);
    System.out.println(bs);
    Derivedclass dc=new Derivedclass("ct100","red","hero",2,"bike");
        System.out.println(dc);
    }
}
