public class Worker {
    private String name;
    private String birthDate;
    protected String endDate;

    public Worker(String name, String birthDate)
    {
        this.name = name;
        this.birthDate = birthDate;

    }

    public String getName() {
        return name;
    }

    public int getAge()
    {
        int birthDay = 0;
        try {
            birthDay = Integer.parseInt(this.birthDate);
            if(birthDay > 2025)
            {
                System.out.println("Enter a valid date");
            }
        }catch (NumberFormatException e)
        {
            System.out.println("Please enter a valid value!");
        }
        return 2025 - birthDay;
    }

    public double collectPay()
    {
        return 1;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }

    public void terminate(String endDate)
    {
        this.endDate = endDate;
    }
}
