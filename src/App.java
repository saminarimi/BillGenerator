
public class App {

    public static void main(String[] args) throws Exception {

        // Pizza basepizza = new Pizza(false);
        // basepizza.addExtraCheese(2);
        // // String Peparoni = "Peparoni";
        // // basepizza.addToppings(Peparoni);
        // basepizza.takeAway();
        // basepizza.getBill();

        DeluxPizza dp = new DeluxPizza(true);
        dp.addExtraCheese(5);
        dp.takeAway();
        dp.getBill();
    }
}
