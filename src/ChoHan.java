import java.util.Scanner;

public class ChoHan
{
    public static void main(String[] args)
    {
        final int MAX_ROUNDS = 5;
        Scanner sc = new Scanner(System.in);
        String p1N,p2N;

        System.out.println("Please enter player 1 name: ");
        p1N = sc.nextLine();
        System.out.println("Please enter player 2 name: ");
        p2N = sc.nextLine();

        Player p1 = new Player(p1N);
        Player p2 = new Player(p2N);
        Dealer d = new Dealer();

        for(int i = 0; i < MAX_ROUNDS; i++)
        {
            System.out.println("");
            System.out.println("Dealer will now roll the dice");
            d.rollDice();

            p1.makeGuess();
            p2.makeGuess();

            roundResults(d,p1,p2);
        }
        displayGrandWinner(p1,p2);
    }

    public static void roundResults(Dealer dealer, Player p1, Player p2)
    {
        System.out.println("The dealer got the following two dice: " + dealer.getD1Value() + " " + dealer.getD2Value());
        System.out.println("Result: ");
    }

    public static void displayGrandWinner(Player p1, Player p2)
    {

    }
}
