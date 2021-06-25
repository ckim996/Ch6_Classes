public class ConstructorDemo
{
    public static void main(String[] args)
    {
        RectangL r = new RectangL(5.0,15.0);

        System.out.println("The box's length is: " + r.getLength());
        System.out.println("The box's width is: " + r.getWidth());
        System.out.println("The box's area is: " + r.getArea());
    }
}
