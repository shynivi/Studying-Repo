public class Main {
    public static void main(String[] args) {



        Printer ye = new Printer(false);
        ye.addToner(111);
        ye.printPage(99);
        Printer yee = new Printer(true);
        yee.addToner(-1);
        yee.printPage(1);

    }
}
