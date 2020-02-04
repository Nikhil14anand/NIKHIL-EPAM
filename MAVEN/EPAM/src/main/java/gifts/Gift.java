package gifts;
import java.util.*;
import sweets.Sweet;

public class Gift{
    ArrayList<Sweet> gifts=new ArrayList<Sweet>();

    public int getWeight(){

        int Weight=0;

        for(int i=0;i<gifts.size();i++)
            Weight+=gifts.get(i).getSWeight();

        return Weight;
    }

    public void addS(Sweet s1)
    {
        gifts.add(s1);
    }

    public String toString(){
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<gifts.size();i++) {
            sb.append(gifts.get(i).getName());
            sb.append(" ");
        }

        return sb.toString();
    }

}