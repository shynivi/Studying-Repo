public class Printer {
    private int tonerLevelOfFullness;
    private int pagesPrintedSuccessfully;
    private boolean duplex; //true = Both sides of paper

    public Printer(boolean duplex, int tonerAmount) {
        this.duplex = duplex;
        this.tonerLevelOfFullness = (tonerAmount >= 0 && tonerAmount <= 100) ? -1 : tonerAmount;

    }

    public int addToner(int tonerAmount)
    {
        int tempAmount = tonerAmount + tonerLevelOfFullness;
        if(tempAmount > 100 || tempAmount < 0)
        {
            return -1;
        }

        tonerLevelOfFullness +=tonerAmount;
        return tonerLevelOfFullness;
    }

    public int printPage(int toPrint)
    {
        int jobPages = (duplex) ? (toPrint / 2) + (toPrint % 2) : toPrint;
        pagesPrintedSuccessfully += jobPages;
        return jobPages;
    }

    public int getPagesPrintedSuccessfully() {
        return pagesPrintedSuccessfully;
    }
}
