import java.util.Scanner;

public class CellPhoneDemo
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String manuf,model;
        double retailPrice;

        System.out.println("Enter the manufacturer: ");
        manuf = sc.nextLine();
        System.out.println("Enter the model: ");
        model = sc.nextLine();
        System.out.println("Enter the retail Price: ");
        retailPrice = sc.nextDouble();

        System.out.println("You have entered the following data to our Phone Catalog: ");
        System.out.println("Manufacturer: \t" + manuf);
        System.out.println("Model: \t\t\t" + model);
        System.out.println("Retail Price: \t$" + retailPrice);
    }
}
