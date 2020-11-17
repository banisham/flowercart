import com.flowercart.entity.Product;
import com.flowercart.strategy.MothersDayStrategy;
import com.flowercart.strategy.PricingStrategy;
import com.flowercart.strategy.RegularStrategy;
import com.flowercart.strategy.ValentinesDayStrategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    List<Product> items;
    PricingStrategy pricingStrategy;

    public ShoppingCart(){
        this.items=new ArrayList<Product>();
    }

    public void addItem(Product product){
        this.items.add(product);
    }

    public void removeItem(Product product){
        this.items.remove(product);
    }

    public void setStrategy(int occasion){
        if (occasion == PricingStrategy.REGULAR)
            this.pricingStrategy = new RegularStrategy();
        else if (occasion == PricingStrategy.VALENTINE)
            this.pricingStrategy = new ValentinesDayStrategy();
        else  if (occasion == PricingStrategy.MOTHER)
            this.pricingStrategy = new MothersDayStrategy();
    }

    public float checkOut(){
        float totalCost = 0;
        printItems();
        totalCost = this.pricingStrategy.calculateTotal(items);
        System.out.println("--------------------------------------------------------------");
        System.out.println(" Total Cost is: " + totalCost);
        System.out.println("--------------------------------------------------------------");
        System.out.println("\n");
        return totalCost;
    }

    public void printItems(){
        for (Product item: items){
            System.out.println(" Product is " + item.getType() + " and the Cost is " + item.getPrice());

        }
    }
}
