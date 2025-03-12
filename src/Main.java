public class Main {
    public static void main(String[] args) {
        // new Object
        Pizza basePizza = new Pizza(false);

        // method call from class
//        basePizza.addExtraToppings();
//        basePizza.addExtraCheese();
//        basePizza.takeAway();
//        basePizza.getBill();

        DeluxPizza dp = new DeluxPizza(false);
        dp.addExtraToppings();
        dp.addExtraCheese();
        dp.getBill();
    }
}