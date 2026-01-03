public class MainChallenge {
    public static void main(String[] args) {


        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver,score,levelCompleted,bonus);

        highScorePosition("Nivi", 1500);
        highScorePosition("Ivan", 1000);
        highScorePosition("Asen", 500);
        highScorePosition("Andrei", 100);
        highScorePosition("Abdul", 25);


        System.out.println("The next highScore is " + calculateScore(gameOver,score,levelCompleted,bonus));
        calculateScore(gameOver,score,levelCompleted,bonus);
     }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus )
    {
        int finalScore = score;

        if(gameOver)
        {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
        }
         return finalScore;
    }

    public static void highScorePosition(String playerName, int score)
    {
        int highScore = calculateHighScorePosition(score);
        System.out.println(playerName + " managed to get into position " + highScore + " on the high score list");
    }

    public static int calculateHighScorePosition(int score)
    {
        if(score >= 1000) {
            return 1;
        }
        else if(score >= 500) {
            return 2;
        }
        else if(score >= 100) {
            return 3;
        }
        else {
            return 4;
        }
    }

}