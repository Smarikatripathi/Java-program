package Shapes;

class Circle extends Shape {

    static final float PI = 3.14f;
    public float radius;

    public Circle(float radius)
    {
        this.radius = radius;
    }

    public float calculateArea()
    {
        return PI * radius * radius;
    }

    public void display()
    {
        System.out.println("The area of circle with radius "+ radius + " is "+ calculateArea());
    }

}
