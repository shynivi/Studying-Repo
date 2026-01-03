public class Main
{
    public static void main(String[] args)
    {
        Car car = new Car();


        Car targa = new Car();

        targa.setMake("Porsche");
        targa.setModel("Targa");
        targa.setDoors(2);
        targa.setConvertible(false);
        targa.setColor("red");

        targa.describeCar();
    }
}
