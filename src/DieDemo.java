import java.util.Scanner;

public class DieDemo
{
    public static void main(String[] args)
    {
        final int DIE1_SIDES = 6;
        final int DIE2_SIDES = 12;
        final int MAX_ROLLS = 5;

        Die d1 = new Die(DIE1_SIDES);
        Die d2 = new Die(DIE2_SIDES);

        System.out.println("This simulates the rolling of a " + DIE1_SIDES +" sided die and a " + DIE2_SIDES + " sided die.");
        System.out.println("Initial value of the dice: ");
        System.out.println(d1.getValue() + " " + d2.getValue());

        System.out.println("Rolling the dice " + MAX_ROLLS + " times");

        for(int i = 0; i < MAX_ROLLS; i++)
        {
            d1.roll();
            d2.roll();

            System.out.println(d1.getValue() + " " + d2.getValue());
        }
    }
}
