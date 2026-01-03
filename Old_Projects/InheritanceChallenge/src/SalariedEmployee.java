public class SalariedEmployee extends Employee{
    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthDate, String hireDate, double annualSalary) {
        super(name,birthDate,hireDate);
        this.annualSalary = annualSalary;
    }


    public void retire()
    {
        isRetired = true;
        System.out.println("This employee has retired!");
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public double collectPay() {
         double paycheck = annualSalary / 12;
         double adjustedPay = (isRetired) ? 0.9 * paycheck : paycheck;

         return (int) adjustedPay;
    }

    @Override
    public void terminate(String endDate) {
        super.terminate(endDate);
        System.out.println(super.getName()+ " has been terminated on " + endDate);

    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "annualSalary=" + annualSalary +
                ", isRetired=" + isRetired +
                "} " + super.toString();
    }
}
