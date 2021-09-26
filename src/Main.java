import Modules.PizzaMenuItems;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        List<PizzaMenuItems> PizzaMenuList = new ArrayList<PizzaMenuItems>();

        PizzaMenuList.add(new PizzaMenuItems("cheese", "cheese pizza", 160));
        PizzaMenuList.add(new PizzaMenuItems("ham", "ham pizza", 155));
        PizzaMenuList.add(new PizzaMenuItems("corn", "corn pizza", 200));

        Iterator itr=PizzaMenuList.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next().toString());

        }



    }
}
