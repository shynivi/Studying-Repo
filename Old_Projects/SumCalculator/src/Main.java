public class Main {
    private double firstNumber;
    private double secondNumber;


    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getAdditionResult()
    {
        return this.firstNumber + this.secondNumber;
    }

    public double getSubtractionResult()
    {
        return this.firstNumber - this.secondNumber;
    }

    public double getMultiplicationResult()
    {
        return this.firstNumber * this.secondNumber;
    }

    public double getDivisionResult()
    {
        double sum = this.firstNumber / this.secondNumber;
        if(Double.isInfinite(sum))
        {
            return 0;
        }
        else
            return sum;
    }
}
