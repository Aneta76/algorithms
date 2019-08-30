public class Rectangle {

    public double countRectangleArea(double a, double b) {
        double area = a * b;
        return area;
    }

   public double countRadius(double circleArea){
       double radiusSqrt = circleArea/Math.PI;
       double radius = Math.sqrt(radiusSqrt);
       return radius;
   }

   public double countCuboidVolume(double a,double b,double c){
        double volume = a*b*c;
        return volume;
   }

   public double countSphereRadius(double volume){
       // volume = 4/3 * PI * r^3
       double radius3 = volume/((4/3f)*Math.PI);
       double radius = Math.cbrt(radius3);
       return radius;
   }


    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
       // System.out.println(rectangle.countRadius(rectangle.countRectangleArea(5.0, 4.0)));
        System.out.println(rectangle.countSphereRadius(60));
    }
}

//
//    Napisz algorytm, który policzy pole prostokąta o bokach a i b (parametry metody). Następnie wyznacz promień koła, którego pole jest równe polu wcześniej policzonego prostoKONTA.

//    Napisz algorytm, który policzy obj prostopadloscianu (parametry metody). Następnie wyznacz promień kuli, którego obj jest równe polu wcześniej policzonego prostopadloscianu.