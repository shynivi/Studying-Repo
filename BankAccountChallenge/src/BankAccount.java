public class BankAccount
{
    private int accountNumber;
    private int accountBalance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount()
    {
        this(123412,123,"default name","default email", "default phone");
        System.out.println("This is an empty constructor!");

    }

    public BankAccount(int accountNumber, int accountBalance, String customerName, String email, String phoneNumber)
    {
        System.out.println("Constr executed");
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(int fundsDeposit)
    {
        if(fundsDeposit < 0)
        {
            System.out.println("Please select a valid number!");

        }else {
            this.accountBalance += fundsDeposit;
        }
    }
    public void withdrawlFund(int fundsWithdrawl)
    {
        if(this.accountBalance - fundsWithdrawl < 0)
        {
            System.out.println("You don't have " + fundsWithdrawl + " to withdrawl.");
        }else {
            this.accountBalance -= fundsWithdrawl;
        }
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
