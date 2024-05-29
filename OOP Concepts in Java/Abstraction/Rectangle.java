package Shapes;

class Rectangle extends Shape {

    public float length, breadth;

    public Rectangle(float length, float breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }

    public float calculateArea()
    {
        return length * breadth;
    }

    public void display()
    {
        System.out.println("The area of rectangle is "+ calculateArea());
    }

}
