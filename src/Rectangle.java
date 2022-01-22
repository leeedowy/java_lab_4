public class Rectangle extends Figure {
    @Override
    double area(double a, double b) {
        return a*b;
    }

    @Override
    double circumference(double a, double b) {
        return 2*a+2*b;
    }
}
