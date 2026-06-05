public class OverloadingPractice {

    static double area(double radius) {
        return Math.PI * radius * radius;
    }

    static double area(double length, double width) {
        return length * width;
    }

    static double area(double base, double height, String shape) {

        if (shape.equalsIgnoreCase("triangle")) {
            return 0.5 * base * height;
        }

        return 0;
    }

    public static void main(String[] args) {

        System.out.println("Circle area = " + area(5));

        System.out.println("Rectangle area = " + area(4, 6));

        System.out.println("Triangle area = " + area(3, 4, "triangle"));
    }
}