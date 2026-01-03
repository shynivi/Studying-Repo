public class Main {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes)
    {
        if(kiloBytes < 0)
        {
            System.out.println("Invalid Value");
        }
        else{
            int kbToMb = kiloBytes / 1024;
            int kbRemainder = kiloBytes % 1024;

            System.out.println(kiloBytes + " KB = " + kbToMb + " MB and " + kbRemainder + " KB");
        }
    }
}
