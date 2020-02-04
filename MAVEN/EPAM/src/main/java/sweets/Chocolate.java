package sweets;

public class Chocolate extends Sweet{
    String chocolateBrandName;

    public Chocolate(String name,int price,int weight,String chocolateBrandName){
        super(name,price,weight);
        this.chocolateBrandName=chocolateBrandName;
    }

}