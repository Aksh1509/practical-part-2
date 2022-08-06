public class Circle
{
    public double radius,area,parameter;
    Circle()
    {
        System.out.println("Enter the circle radius");
        radius=1;
    }
    Circle(double radius)
    {
        this.radius=radius;
    }
    double getarea()
    {
        area= radius*radius*3.14;
        return area;
    }
    double getparameter()
    {
        parameter = 2*3.14*radius;
        return parameter;
    }

}

