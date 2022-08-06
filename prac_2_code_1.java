// Name : AKSH_SURANI
// ID : 21CE140
// Div: CE2 C2

// Design a class named Circle containing following attributes and behavior.
// One double data field named radius. The default value is 1.
// A no-argument constructor that creates a default circle.
// A Single argument constructor that creates a Circle with the specified radius.
// A method named getArea() that returns area of the Circle.
// A method named getPerimeter() that returns perimeter of it.
// Design a class named Circle containing following attributes and
//  behavior.•Onedouble data field named radius. The default valueis1.•A no-
//  argumentconstructor that creates a default circle.•A Single argument
//  constructor that creates a Circle with the specified radius.•A method named
//  getArea() that returns area of the Circle.•A method named getPerimeter()
//  that returns perimeterof it

import java.util.Scanner;

public class prac_2_code_1
{
    public static void main(String[] args)
    {
        Circle c1 = new Circle();
        System.out.println(c1.getarea());
        System.out.println(c1.getparameter());
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        Circle c2 = new Circle(radius);
        System.out.println(c2.getarea());
        System.out.println(c2.getparameter());
    }
}
