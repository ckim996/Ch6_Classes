public class Employee
{
    private String name;
    private int idNum;
    private String department;
    public String position;

    public Employee(String n, int idN, String dptmt, String pos)
    {
        this.name = n;
        this.idNum = idN;
        this.department = dptmt;
        this.position = pos;
    }

    public Employee(String n, int idN)
    {
        this.name = n;
        this.idNum = idN;
        department = "";
        position = "";
    }

    public Employee()
    {
        name = "";
        idNum = 0;
        department = "";
        position = "";
    }

    public void setName(String n)
    {
        this.name = n;
    }

    public String getName()
    {
        return name;
    }

    public void setIdNum(int idN)
    {
        this.idNum = idN;
    }

    public int getIdNum()
    {
        return idNum;
    }

    public void setDepartment(String dpt)
    {
        this.department = dpt;
    }

    public String getDepartment()
    {
        return department;
    }

    public void setPosition(String pos)
    {
        this.position = pos;
    }

    public String getPosition()
    {
        return position;
    }
}
