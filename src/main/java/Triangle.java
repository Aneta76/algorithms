public class Triangle {

    public double countArea(double a, double h) {
        return 0.5 * a * h;
    }

    public double countAreaWithHeron(double a, double b, double c) {
        double halfSemiPerimeter = 0.5 * (a + b + c);
        return Math.sqrt(halfSemiPerimeter * (halfSemiPerimeter - a) * (halfSemiPerimeter - b) * (halfSemiPerimeter - c));
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        System.out.println(triangle.countArea(10, 2));
        System.out.println(triangle.countAreaWithHeron(10, 2, 20));
    }
}

// Oblicza pole powierzchni trójkąta o bokach a,b,c