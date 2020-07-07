package collections;

import java.util.ArrayList;
import java.util.Iterator;
public class Arraylist {
    //it grows dynamically
    private float balance;
    private int id;
    public Arraylist(int id,float balance){
        this.id=id;
        this.balance=balance;
    }

    @Override
    public String toString() {
        return "Arraylist{" +
                "balance=" + balance +
                ", id=" + id +
                '}';
    }
}
class Implements{



     ArrayList<Arraylist> obj=new ArrayList <Arraylist>();



    void insert(int id, float balance){
        Arraylist o=new Arraylist(id,balance);

        obj.add(o);
    }

    void display(){
        Iterator it=obj.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }

    public static void main(String[] args) {
        Implements g=new Implements();
        g.insert(54,45.2f);
        g.insert(48,47.23f);
        g.display();
    }

}
