public class Main {
    public static void main(String[] args) {

        Wall newWall = new Wall(-1.25,-1.25);
        System.out.println(newWall.getArea());
       // newWall.setHeight(-1.5);
        System.out.println("H: " + newWall.getHeight());
        System.out.println("W: " + newWall.getWidth());
        System.out.println(newWall.getArea());
        System.out.println(Wall.dog);
    }
}
