public class Main {
    public static void main(String[] args) {
        System.out.println(canPack(2,2,11));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal)
    {
        if(bigCount < 0 || smallCount < 0 || goal < 0)
        {
            return false;
        }
        int sum = (bigCount * 5) + smallCount;
        if(sum < goal)
        {
            return false;
        }

        return goal % 5 >= smallCount;

    }
}
