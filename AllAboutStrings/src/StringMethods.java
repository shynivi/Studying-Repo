public class StringMethods {
    public static void main(String[] args) {

        String birtDate = "25/11/1982";
        int startingIndex = birtDate.indexOf("1982");
        System.out.println("startingIndex = " + startingIndex);

        // It starts from the index and it prints everything after wards
        System.out.println("Birth year = " + birtDate.substring(startingIndex));

        //Prints everything from index 3 to 4 and excluding 5
        System.out.println("Month = " + birtDate.substring(3,5));

        //Prints the birthday but with a "/" inbetween every element
        String newDate = String.join("/", "25","11","1982");
        System.out.println("newDate = " + newDate);

        //Does the same thing as the String.join
        newDate = "25";
        newDate = newDate.concat("/");
        newDate = newDate.concat("11");
        newDate = newDate.concat("/");
        newDate = newDate.concat("1982");
        System.out.println("newDate = " + newDate);

        //Same thing ^ but more efficient
        newDate = "25" + "/" + "11" + "/" + "1982";
        System.out.println(newDate);

        // It's called method chaining, like writing concant on a new line.
        newDate = "25".concat("/").concat("11").concat("/").concat("1982");
        System.out.println(newDate);

        System.out.println(newDate.replace('/', '-'));
        System.out.println(newDate.replace("2", "00"));

        System.out.println(newDate.replaceFirst("/", "-"));
        System.out.println(newDate.replaceFirst("/", "---"));

        System.out.println("ABC\n".repeat(3));
        System.out.println("-".repeat(20));

        System.out.println("ABC\n".repeat(3).indent(8));
        System.out.println("-".repeat(20));

        System.out.println("   ABC\n".repeat(3).indent(-2));
        System.out.println("-".repeat(20));

    }
}
