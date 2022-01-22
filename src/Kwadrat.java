public class Kwadrat extends Figure {
    @Override
    double area(double a, double b) {
        return a*a;
    }

    @Override
    double circumference(double a, double b) {
        return 4*a;
    }
}
