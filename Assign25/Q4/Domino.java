public class Domino {
    
    FoodItems fI = new FoodItems();

   
    public void selectFoodItem() {
       
        System.out.println("Selecting food item...");
        

        EatItems eat = fI.eat();
        eat.displayEat(); 
        
      
        DrinkItems drink = fI.drink();
        drink.displayDrink(); 
    }
}