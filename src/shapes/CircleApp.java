package shapes;

public class CircleApp {
    public static void main(String[] args){
        System.out.println("Here's how many circles are created right now: ");
        System.out.println(Circle.getNumberOfCircles());

        Circle one = new Circle(1);
        System.out.println(Circle.getNumberOfCircles());

        Circle another = new Circle(44);
        System.out.println(Circle.getNumberOfCircles());
    }
}
