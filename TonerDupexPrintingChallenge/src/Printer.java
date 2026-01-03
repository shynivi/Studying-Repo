public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer( int tonerLevel, boolean duplex) {
        this.duplex = duplex;
        this.tonerLevel = (tonerLevel > -1 && tonerLevel <= 100) ? tonerLevel : -1;
        pagesPrinted = 0;
    }

    public int addToner(int tonerAmount)
    {
        int tempAmount = tonerLevel + tonerAmount;
        if(tempAmount < 0 || tempAmount > 100)
        {
            return -1;
        }
        else {
            tonerLevel = tempAmount;
            return tonerLevel;
        }
    }

    public int printPages(int pages)
    {
        int pagesToPrint = (duplex) ? (pages / 2) + (pages % 2) : pages;
        pagesPrinted += pagesToPrint;
        return pagesToPrint;

    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
