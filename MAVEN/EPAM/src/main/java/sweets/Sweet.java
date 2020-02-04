package sweets;

public class Sweet implements Comparable<Sweet>{

    private String name;
    private int price;
    private int weight;

    public Sweet(String name,int price,int weight){
        this.name=name;
        this.price=price;
        this.weight=weight;
    }

    public String getName(){
        return name;
    }

    public int getPrice(){
        return price;
    }

    public int getSWeight(){
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String toString(){
        return "Sweet name : "+name+" weight : "+weight+" price : "+price;
    }

    public int compareTo(Sweet s){
        return getPrice()-s.getPrice();
    }
}