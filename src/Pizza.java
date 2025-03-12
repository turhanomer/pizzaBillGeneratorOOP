public class Pizza {
private Integer price;
private Boolean veg;

private Integer extraCheesePrice = 100;
private Integer extraToppingsPrice = 150;
private Integer backPackPrice = 20;
private Integer basePizzaPrice;
private boolean isExtraCheeseAdded = false;
private boolean isExtraToppingsAdded = false;
private boolean isOptedForTakeAway = false;

//constructor method
public Pizza(Boolean veg){
    this.veg = veg;
    // if there is veg, make the price 300, if not, make the price 400
    if (this.veg){
        this.price = 300;
    }else{
        this.price = 400;
    }
    basePizzaPrice = this.price;
}

// create method and trade at the price
public void addExtraCheese(){
    isExtraCheeseAdded = true;
    this.price += extraCheesePrice;
}
public void addExtraToppings(){
    isExtraToppingsAdded = true;
    this.price += extraToppingsPrice;
}
public void takeAway(){
    isOptedForTakeAway = true;
    this.price += backPackPrice;
}

// create a bill
public void getBill(){
    String bill = "";
    System.out.println("Pizza: " + basePizzaPrice);
    if (isExtraCheeseAdded){
        bill += "Extra cheese added:" + extraCheesePrice + "\n";
    }
    if (isExtraToppingsAdded){
        bill += "Extra toppings added:" + extraToppingsPrice + "\n";
    }
    if (isOptedForTakeAway){
        bill += "Take Away:" + backPackPrice + "\n";
    }
    bill += "Bill:" + this.price + "\n";
    System.out.println(bill);
}
}
