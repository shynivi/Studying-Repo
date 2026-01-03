public class Main {
    public static void main(String[] args) {
        double km = (100 * 1.609344);

        int highScore = 50;
        if(highScore > 25)
        {
            highScore += 1000;
        }

        int health = 100;
        if((health < 25) && (highScore > 1000))
        {
            highScore -= 1000;
        }
    }
}