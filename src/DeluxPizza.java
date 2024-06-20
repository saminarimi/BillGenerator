public class DeluxPizza extends Pizza {

    public DeluxPizza(Boolean veg) {
        super(veg);
        super.addExtraCheese(1);
        String Peparoni = "Peparoni";
        super.addToppings(Peparoni);
    }

    public void addExtraCheese(int noOfSlice) {
    }

    public void addToppings() {

    }

}