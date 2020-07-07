package Encapsulation;

public class GFG {
    private int data;
    private String name;
    GFG(int data,String name){
        this.data=data;
        this.name=name;
    }
   public int getData(){
        return data;
    }

    public String getName() {
        return name;
    }
    public void setData(int data){
        this.data=data;
    }
    public  void setName(String name){
        this.name=name;
    }

    public static void main(String[] args) {
        GFG obj=new GFG(21,"vivek");
        System.out.println(obj.getData());
        System.out.println(obj.getName());
        obj.setData(52);
        System.out.println(obj.getData());
    }

}
