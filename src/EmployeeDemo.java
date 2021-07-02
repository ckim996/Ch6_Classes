import java.util.Scanner;

public class EmployeeDemo
{
    public static void main(String[] args)
    {
        Employee sM = new Employee("Susan Meyers", 47899, "Accounting","Vice President");
        Employee mJ = new Employee("Mark Jones", 39119);
        Employee jR = new Employee("Joy Rogers", 81774, "Manufacturing", "Engineer");
        Employee unknown = new Employee();

        System.out.println("Name\t\t\tID Number\t\tDepartment\t\tPosition");
        System.out.println(sM.getName() + "\t" +sM.getIdNum() + "\t\t\t" + sM.getDepartment() + "\t\t" + sM.getPosition());
        System.out.println(mJ.getName() + "\t\t" +mJ.getIdNum() + "\t\t\t" +mJ.getDepartment() + "\t\t" + mJ.getPosition());
        System.out.println(jR.getName() + "\t\t" +jR.getIdNum() + "\t\t\t" +jR.getDepartment() + "\t" + jR.getPosition());
    }
}
