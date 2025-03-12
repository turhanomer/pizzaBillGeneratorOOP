public class Main {
    public static void main(String[] args) {
        // new Object
        Pizza basePizza = new Pizza(false);

        // method call from class
        basePizza.addExtraOppings();
        basePizza.addExtraCheese();
        basePizza.takeAway();
        basePizza.getBill();
    }
}