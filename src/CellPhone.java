public class CellPhone
{
    private String manufact;
    private String model;
    private double retailPrice;

    public CellPhone(String man, String mod, double rP)
    {
        manufact = man;
        model = mod;
        retailPrice = rP;
    }

    public void setManufact(String man)
    {
        manufact = man;
    }

    public void setModel(String mod)
    {
        model = mod;
    }

    public void setRetailPrice(double rP)
    {
        retailPrice = rP;
    }

    public String getManufact()
    {
        return manufact;
    }

    public String getModel()
    {
        return model;
    }

    public double getRetailPrice()
    {
        return retailPrice;
    }
}
