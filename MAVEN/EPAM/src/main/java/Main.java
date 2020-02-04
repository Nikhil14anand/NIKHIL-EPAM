import gifts.*;
import sweets.*;

public class Main{
    public static void main(String args[]){
        Sweet k=new Chocolate("K",50,80,"5 star");
        Sweet l=new Chocolate("L",200,20,"Milky Bar");
        Sweet m=new Candy("M",10,8,"kisme");

        Gift gifts=new Gift();
        gifts.addS(k);
        gifts.addS(l);
        gifts.addS(m);

        System.out.println(gifts.getWeight());
        System.out.println(gifts.toString());
    }
}