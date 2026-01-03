public class SmartKitchen {
    private CoffeeMaker brewMaster;
    private DishWasher dishWasher;
    private Refrigerator iceBox;

    SmartKitchen() {
        brewMaster = new CoffeeMaker();
        dishWasher = new DishWasher();
        iceBox = new Refrigerator();

    }

    public void kitchenState(boolean coffee, boolean dish, boolean fridge)
    {
        brewMaster.setHasWorkToDo(coffee);
        dishWasher.setHasWorkToDo(dish);
        iceBox.setHasWorkToDo(fridge);
    }

    public void doKitchenWork()
    {
            brewMaster.brewCoffee();
            dishWasher.doDishes();
            iceBox.orderFood();
    }

}

class Refrigerator {
    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    protected void orderFood()
    {
        if(hasWorkToDo) {
            System.out.println("Ordering food!");
            hasWorkToDo = false;
        }
    }
}

class DishWasher{
    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    protected void doDishes()
    {
        if(hasWorkToDo) {
            System.out.println("Doing dishes!");
            hasWorkToDo = false;
        }
    }
}

class CoffeeMaker{
    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    protected void brewCoffee()
    {
        if(hasWorkToDo) {
            System.out.println("Brewing coffee!");
            hasWorkToDo = false;
        }
    }
}
