public class Temperature
{
    private double ftemp;

    public Temperature(double fahr)
    {
        ftemp = fahr;
    }

    public void setFahrenheit(double fahr)
    {
        ftemp = fahr;
    }

    public double getFahrenheit()
    {
        return ftemp;
    }

    public double getCelsius()
    {
        return (ftemp-32)*(0.55555556);
    }

    public double getKelvin()
    {
        return ((ftemp-32)*(0.55555556))+273;
    }
}
