class Pizza {

    private int price; // the price will be fixed that's why we don't need it in the contructor
    private Boolean veg; // true ------> veg false------> non veg
    private int basePizzaPrice;
    private int cheesePrice = 0;
    private int toppingPrice = 0;
    private int takeawayPrice = 0;
    private boolean isCheeseAdded;
    private boolean isToppingAdded;
    private boolean isTakeaway;

    public Pizza(Boolean veg) {
        this.veg = veg;
        if (this.veg) {
            this.price = 300;
        } else {
            this.price = 400;
        }
        this.basePizzaPrice = this.price;
    }

    public void getPrice() {
        System.out.println(this.price);
    }

    public void addExtraCheese(int noOfSlice) {
        this.cheesePrice = 50 * noOfSlice;
        this.price = this.price + cheesePrice;
        this.isCheeseAdded = true;
    }

    public void addToppings(String toppings) {

        if (toppings == "Peparoni") {
            this.price = this.price + 100;
            this.toppingPrice = 100;
        } else if (toppings == "Mashrooms") {
            this.price = this.price + 50;
            this.toppingPrice = 50;
        }

        this.isToppingAdded = true;
    }

    public void takeAway() {
        this.price = this.price + 20;
        this.takeawayPrice = 20;
        this.isTakeaway = true;
    }

    public void getBill() {
        System.out.println("Base Pizza: " + basePizzaPrice);
        if (isCheeseAdded) {
            System.out.println("Cheese: " + cheesePrice);
        }
        if (isToppingAdded) {
            System.out.println("Toppings: " + toppingPrice);
        }
        if (isTakeaway) {
            System.out.println("Takeaway: " + takeawayPrice);
        }
        System.out.println("Total: " + (basePizzaPrice + cheesePrice + toppingPrice + takeawayPrice));
    }

}
