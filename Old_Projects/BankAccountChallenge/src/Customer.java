public class Customer {

    private String name;
    private int creditLimit;
    private String email;

    public Customer(String name, int creditLimit, String email)
    {
        this.creditLimit = creditLimit;
        this.email = email;
        this.name = name;
    }

    public Customer()
    {
        this("No Name Added", "nivi@proton.me");
    }
    public Customer(String name, String email)
    {
        this(name,9123,email);
    }

    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
