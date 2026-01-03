public class Player {
    public String fullName;
    public int health;
    public String weapon;

    public void loseHealth(int damage)
    {
        health -= damage;
        if(health <= 0)
        {
            System.out.println("Player was knocked out of the game");
        }
    }

    public int healthRemaining()
    {
        return health;
    }

    public void restoreHealth(int extraHealth)
    {
        health += extraHealth;
        if(health>100)
        {
            System.out.println("Restored to full health");
            health = 100;
        }
    }
}
