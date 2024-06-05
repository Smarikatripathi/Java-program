import Shapes.Circle;
import Shapes.Rectangle;

public class Main {

    public static void main(String[] args)
    {
        Rectangle rectangle = new Rectangle(3.1f, 4.0f);
        rectangle.display();

        Circle circle = new Circle(4.5f);
        circle.display();

    }

}
