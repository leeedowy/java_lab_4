public class House implements Building {

    private double area;
    private String adress;
    private int numberOfWindows;
    private int numberOfResidents;
    private ColorEnum buildingColor;

    @Override
    public double area(double area) {
        this.area = area;
        return area * 1.5;
    }

    @Override
    public String buildingAdress(String adress) {
        this.adress = adress;
        return String.format("Adress: %s", adress);
    }

    @Override
    public int numberOfWindows(int value) {
        this.numberOfWindows = value;
        return numberOfWindows * 2;
    }

    @Override
    public void numberOfResidents(int value) {
        this.numberOfResidents = value;
    }

    @Override
    public void buildingColor(ColorEnum color) {
        this.buildingColor = color;
    }

    @Override
    public double calculateMonthlyRevenue(double sellingCoefficient, double costPerSquareMeter) {
        return sellingCoefficient * costPerSquareMeter * area;
    }

    public int getNumberOfResidents() {
        return numberOfResidents;
    }

    public ColorEnum getBuildingColor() {
        return buildingColor;
    }

    @Override
    public String toString() {
        return String.format("adress: %s; area: %.2f; color: %s; windows: %d; residents: %s",
                adress, area, buildingColor.toString(), numberOfWindows, numberOfResidents);
    }
}
