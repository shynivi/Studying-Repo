public class Main {
    public static void main(String[] args) {
        SalariedEmployee ivan = new SalariedEmployee("Nikola","2001","01/01/2008", 74621);
        SalariedEmployee hasan = new SalariedEmployee("Asen","1928","02/02/2009", 12838);
        SalariedEmployee has = new SalariedEmployee("Asen","1928","02/02/2009", 12838);

        System.out.println(ivan.getAge());

        ivan.terminate("2027");
        System.out.println("_______");
        System.out.println(ivan.collectPay());
        ivan.retire();
        System.out.println(hasan.getAge());
        hasan.terminate("2028");
        System.out.println(ivan.collectPay());
        System.out.println(ivan);
        System.out.println(hasan);
        System.out.println(has);
    }
}
