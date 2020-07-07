package Inheritance;

public class Derivedclass extends Baseclass {
    private String  modelname;
    private String color;
    float milage;
    public Derivedclass(String modelname,String color,String company,int seater,String type){
       // super(getCompany(),gettype(),getSeater());
        super(company,type,seater);
        this.modelname=modelname;
        this.color=color;

    }
    public Derivedclass(){
        super();
        modelname=null;
        color=null;
    }

    @Override
    public String toString() {
        return "Derivedclass{" +
                "modelname='" + modelname + '\'' +
                ", color='" + color + '\'' +
                ", milage=" + milage +
                '}';
    }
}
