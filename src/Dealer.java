import java.util.Random;

public class Dealer
{
    private int d1Value;
    private int d2Value;

    public Dealer()
    {
        d1Value = 0;
        d2Value = 0;
    }

    public void rollDice()
    {
        final int SIDES = 6;

        Die d1 = new Die(SIDES);
        Die d2 = new Die(SIDES);

        d1Value = d1.getValue();
        d2Value = d2.getValue();
    }

    public String getChoOrHan()
    {
        //CHO =EVEN     HAN=ODD
        String result;

        int sum = d1Value + d2Value;

        if(sum % 2 == 0)
        {
            result = "Cho (even)";
        }else{
            result = "Han (odd)";
        }

        return result;
    }

    public int getD1Value()
    {
        return d1Value;
    }

    public int getD2Value()
    {
        return d2Value;
    }

}
