import java.util.Scanner;

public class TemperatureDemo
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double fahr;
        int choice;
        System.out.print("Please tell us temperature in fahrenheit: ");
        fahr = sc.nextDouble();
        System.out.print("\nConvert to (1) Celsius or (2) Kelvin? Please input 1 or 2:");
        choice = sc.nextInt();

        do
        {
            if(choice == 1)
            {
                Temperature temp1 = new Temperature(fahr);
                System.out.printf("Converting %.2f to Celsius %.2f", temp1.getFahrenheit(), temp1.getCelsius());
                break;
            }else if(choice == 2)
            {
                Temperature temp2 = new Temperature(fahr);
                System.out.printf("Converting %.2f to Kelvin %.2f", temp2.getFahrenheit(),temp2.getKelvin());
                break;
            }else{
                System.out.println("Shutting down because you inputted the wrong input!");
                System.exit(0);
            }
        }while(choice == 1 || choice ==2);

    }
}
