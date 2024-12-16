class FoodItems {
   
    public EatItems eat() {
        System.out.println("Eating food items...");
        return new EatItems(); 
    }

    
    public DrinkItems drink() {
        System.out.println("Drinking beverage...");
        return new DrinkItems(); 
    }
}