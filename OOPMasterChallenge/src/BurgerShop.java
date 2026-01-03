public class BurgerShop {
    private Burger burger;
    private Drink drink;
    private Side side;

    public BurgerShop(Burger burger, Drink drink, Side side) {
        this.burger = burger;
        this.drink = drink;
        this.side = side;
    }
    
}

class Burger {
    private String type;
    private double price;
    private int topping;

    Burger(String type, double price, int topping) {
        this.type = type;
        this.price = price;
        this.topping = topping;
    }

    public double getPrice() {
        return price;
    }
}

class Drink{
    private String type;
    private double price;
    private String size;

    Drink(String type, String size) {
        this.type = type;
        switch(size.toUpperCase().charAt(0))
        {
            case 'S' ->
            {
                price = 1.50;
            }
            case 'M' ->
            {
                price = 2.50;
            }
            case 'L' ->
            {
                price = 3.50;
            }
            default -> price = 0;
        }
    }

    public double getPrice() {
        return price;
    }
}

class Side{
    private String type;
    private double price;

    Side(String type, double price) {
        this.type = type;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
