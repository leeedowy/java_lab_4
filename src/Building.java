public interface Building {

    double area(double pow);
    String buildingAdress(String adress);
    int numberOfWindows(int value);
    void numberOfResidents(int value);
    void buildingColor(ColorEnum color);
    double calculateMonthlyRevenue(double sellingCoefficient, double costPerSquareMeter);
}
