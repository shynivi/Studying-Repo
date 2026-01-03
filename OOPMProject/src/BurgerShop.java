import java.util.Scanner;

public class BurgerShop {

    public BurgerShop() {
    }
    public void order()
    {
        Scanner s = new Scanner(System.in);

        String value;

        System.out.println("Welcome to the Burger Shop!");
        System.out.println("___________________________");
        System.out.println("Choose the burger that you want:\n" +
                "Cheeseburger (Regular or Large).\n" +
                "Deluxe Burger (Everything for 35$).\n" +
                "Regular Order.\n"+
                "Or press 'Q' to quit!");
        while(true)
        {
            value = s.nextLine();
            if(value.toUpperCase().charAt(0) == 'C')
            {
                Burger burger = new Burger();
                Drink drink = new Drink();
                Side side = new Side();

                burger.getBurger("Cheeseburger");
                burger.setTopping();
                drink.setDrink();
                side.getSide();
                receipt(burger,drink,side);

                break;
            }
            else if(value.toUpperCase().charAt(0) == 'D')
            {
                Burger DeluxeBurger = new Burger("Deluxe", 17,5);
                Drink DeluxeDrink = new Drink("Any Drink of Choice", 5,"Large");
                Side DeluxeSide = new Side("Any Side of Choice", 3);
                receipt(DeluxeBurger,DeluxeDrink,DeluxeSide);
                break;
            }
            else if(value.toUpperCase().charAt(0) == 'R')
            {
                Burger defBurger = new Burger("Hamburger", 12.5,2);
                Drink defDrink = new Drink("Ayrqn", 2.5,"Medium");
                Side defSide = new Side("5 Tim-bits", 3.25);
                receipt(defBurger,defDrink,defSide);
                break;
            }
            else if(value.toUpperCase().charAt(0) == 'Q')
            {
                System.out.println("Goodbye!");
                break;
            }
            else
            {
                System.out.println("Enter a valid meal!");
            }
        }
    }
    private void receipt(Burger var1, Drink var2, Side var3)
    {
        double sum = var1.getPrice() + var2.getPrice() + var3.getPrice();
        System.out.println("Your order is:\n" +
                "Burger: " + var1.getType() + " with " + var1.getTopping() + " toppings" + "\n" +
                "Drink: " + var2.getType() + "\n" +
                "Side: " + var3.getType() + "\n"+
                "For a total of: " + Math.round(sum) + "$");
    }

}

class Burger{
    private String type;
    private double price;
    private int topping;

    public Burger(String type, double price, int topping) {
        this.type = type;
        this.price = price + topping;
        this.topping = topping;
    }
    public Burger() {

    }

    protected void getBurger(String burger)
    {
        Scanner s = new Scanner(System.in);

        type = burger;
        String value;

        System.out.println("Size? \nA) Regular - 15$ \nB) Large - 20$");
        while(true)
        {
            value = s.nextLine();
            if (value.toUpperCase().charAt(0) == 'A') {
                price = 15;
                break;
            } else if(value.toUpperCase().charAt(0) == 'B'){
                price = 20;
                break;
            }else
            {
                System.out.println("Enter a correct value, please!");
            }
        }

    }

    protected void setTopping()
    {
        Scanner s = new Scanner(System.in);
        String value;
        int temp;
        System.out.println("How many toppings? Max 3");
        while(true) {
            try {
                value = s.nextLine();
                temp = Integer.parseInt(value);
                if(temp > 3)
                {
                    System.out.println("Enter a valid number!");
                }
                else
                {
                    topping = temp;
                    price += temp;
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Enter a valid value!");
            }
        }

    }

    protected double getPrice() {
        return price;
    }

    protected String getType() {
        return type;
    }

    public int getTopping() {
        return topping;
    }
}

class Drink{
    private String type;
    private double price;
    private String size;

    public Drink(String type, double price, String size) {
        this.type = type;
        this.price = price;
        this.size = size;
    }
    public Drink()
    {

    }
    protected double getPrice() {
        return price;
    }

    protected String getType() {
        return type;
    }

    protected String getSize() {
        return size;
    }

    protected void setDrink() {
        Scanner s = new Scanner(System.in);
        String value;
        System.out.println("""
                            What drink do you want to buy?
                            Coke Zero - 3$
                            Water - 1.5$
                            """);
        while(true)
        {
            value = s.nextLine();
            if (value.toUpperCase().charAt(0) == 'C') {
                type = ("Coke Zero");
                price = 3;
                break;
            } else if(value.toUpperCase().charAt(0) == 'W'){
                type = ("Water");
                price = 1.5;
                break;
            }else
            {
                System.out.println("Enter a correct value, please!");
            }
        }

    }
}

class Side{
    private String type;
    private double price;

    Side(String type, double price)
    {
        this.type = type;
        this.price = price;
    }
    public Side()
    {

    }

    protected void getSide()
    {
        Scanner s = new Scanner(System.in);
        String value;

        System.out.println("""
                                    What side do you want?
                                    Cheesecake - 3.99$
                                    Vegan Biscuits - 4.99$
                                    """);
        value = s.nextLine();
        while(true)
        {
            if (value.toUpperCase().charAt(0) == 'C') {
                type = "Cheesecake";
                price = 3.99;
                break;
            } else if (value.toUpperCase().charAt(0) == 'V') {
                type = "Vegan Biscuits";
                price = 4.99;
                break;
            } else {
                System.out.println("Enter a valid value!");
            }
        }
    }

    protected double getPrice()
    {
        return price;
    }

    protected String getType()
    {
        return type;
    }
}
