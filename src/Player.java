import java.util.Random;

public class Player
{
    private String name;
    private String guess;
    private int point;

    public Player(String playerName)
    {
        name = playerName;
        guess = "";
        point = 0;
    }

    public void makeGuess()
    {
        Random r = new Random();
        int guessN = r.nextInt(2);

        if(guessN == 0)
        {
            guess = "Cho (even)";
        }else{
            guess = "Han (odd)";
        }
    }

    public void addPoints(int newPoints)
    {
        point += newPoints;
    }

    public String getName()
    {
        return name;
    }

    public String getGuess()
    {
        return guess;
    }

    public int getPoints()
    {
        return point;
    }
}
