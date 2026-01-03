public class Main
{
    public static void main(String[] args)
    {
       // BankAccount nivi = new BankAccount(1234, 1000, "Nikola", "nivi", "08128341");
        BankAccount nivi = new BankAccount();
        nivi.depositFunds(23);
        nivi.depositFunds(23);
        nivi.depositFunds(23);
        nivi.withdrawlFund(100);
        System.out.println(nivi.getAccountBalance());
    }
}
