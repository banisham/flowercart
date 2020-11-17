import com.flowercart.entity.Flower;
import com.flowercart.entity.Toy;

public class FlowersAreForever {
    public static void main(String[] args) {

        FlowersAreForever flowersAreForever = new FlowersAreForever();

        flowersAreForever.motherDaysSales( 1);
        flowersAreForever.valentinesDayStrategy( 0);
        flowersAreForever.regularDaySales( 99);

    }

    private void motherDaysSales(int salesStrategy){
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addItem(new Flower("Rose", 10));
        shoppingCart.addItem(new Flower("Jasmine", 7));
        shoppingCart.addItem(new Flower("Sunflower", 8));
        shoppingCart.addItem(new Toy("Teddy", 40));
        shoppingCart.addItem(new Toy("Remote Car", 30));
        shoppingCart.setStrategy(salesStrategy);
        System.out.println("Applying Mother's Day Sales Strategy.......");
        shoppingCart.checkOut();


    }

    private void valentinesDayStrategy(int salesStrategy){
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addItem(new Flower("Rose", 10));
        shoppingCart.addItem(new Flower("Jasmine", 7));
        shoppingCart.addItem(new Flower("Sunflower", 8));
        shoppingCart.addItem(new Toy("Teddy", 40));
        shoppingCart.addItem(new Toy("Remote Car", 30));
        shoppingCart.setStrategy(salesStrategy);
        System.out.println("Applying Valentines's Day Sales Strategy.......");
        shoppingCart.checkOut();

    }

    private  void regularDaySales(int salesStrategy){
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addItem(new Flower("Rose", 10));
        shoppingCart.addItem(new Flower("Jasmine", 7));
        shoppingCart.addItem(new Flower("Sunflower", 8));
        shoppingCart.addItem(new Toy("Teddy", 40));
        shoppingCart.addItem(new Toy("Remote Car", 30));
        shoppingCart.setStrategy(salesStrategy);
        System.out.println("Applying Regular Day Sales Strategy.......");
        shoppingCart.checkOut();

    }
}

