package Inheritance;

public class Baseclass {
    private String company;
    private String type;
    private int seater;

    public int getSeater() {
        return seater;
    }
    public String getCompany(){
        return company;
    }
    public String gettype(){
        return type;
    }
    public void setCompany(String company){
        this.company=company;
    }
    public void setType(String type){
        this.type=type;
    }
    public void setSeater(int seater){
        this.seater=seater;
    }
    public Baseclass(String company,String type,int seater){
        this.company=company;
        this.type=type;
        this.seater=seater;
    }
    public Baseclass(){
        company=null;
        type=null;
        seater=0;
    }

    @Override
    public String toString() {
        return "Baseclass{" +
                "company='" + company + '\'' +
                ", type='" + type + '\'' +
                ", seater=" + seater +
                '}';
    }
}
