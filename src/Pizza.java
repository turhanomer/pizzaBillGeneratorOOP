public class Pizza {
private Integer price;
private Boolean veg;

private Integer extraCheesePrice = 100;
private Integer extraOppingsPrice = 150;
private Integer backPackPrice = 20;

//constructor method
public Pizza(Boolean veg){
    this.veg = veg;
    // if there is veg, make the price 300, if not, make the price 400
    if (this.veg){
        this.price = 300;
    }else{
        this.price = 400;
    }
}

// create method and trade at the price
public void addExtraCheese(){
    System.out.println("Extra cheese added!");
    this.price += extraCheesePrice;
}
public void addExtraOppings(){
    System.out.println("Extra oppings added!");
    this.price += extraOppingsPrice;
}
public void takeAway(){
    System.out.println("Take away opted!");
    this.price += backPackPrice;
}
public void getBill(){
    System.out.println(this.price);
}
}
