package sweets;

public class Candy extends Sweet{
    String candyBrandName;

    public Candy(String name,int price,int weight,String candyBrandName){
        super(name,price,weight);
        this.candyBrandName=candyBrandName;
    }

}