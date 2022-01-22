public class Main {
    public static void main(String[] args) {

        /* zad.1
        a) Stwożyć interfejs Budynek,
        b) interfejs powinien mieć metody:
            - double powierzchnia(double pow);
            - String adresBudynku(String adres);
            - int liczbaOkien(int value);
            - void liczbaMieszkancow(int value);
            - void kolorDomu(KolorEnum kolor);
        c) stworzyć enum KolorEnum z przykładowymi kolorami,
        d) stworzyć jedną metodę z 2 parametrami wymyśloną przez siebie,
        */

        /* zad.2
        a) napisać klasę Dom implementującą interfejs Budynek,
        b) zaimplementować wszystkie metody,
        c) stworzyć brakujące pola(prywatne), gettery i settery, napisać metodę toString
        (gettery i settery najlepiej wygenerować: Code/Prawy myszy --> Generate --> getters/setters/toString)
        d) stworzyć jedną dowolną metodę przez siebie
        */

        /* zad.3
        a) w klasie Main stworzyć 2 objekty typu Dom deklarując pierwszy objekt Typem Dom,
        drugi objekt typem Budynek,
        b) wykorzystać wszystkie metody do implementacji pól
        c) wyświetlić w konsoli metodę toString (na obu objektach) opisującą zachowanie klasy Dom
        */

        House house1 = new House();
        house1.area(39.92);
        house1.buildingAdress("53 Harolld Street, Glasgow");
        house1.buildingColor(ColorEnum.GREEN);
        house1.numberOfResidents(32);
        house1.numberOfWindows(15);
        System.out.println(house1);
        System.out.printf("%.2f%n", house1.calculateMonthlyRevenue(1.32, 685.93));

        House house2 = new House();
        house2.area(152.37);
        house2.buildingAdress("102b Marlow Avenue, Odessa");
        house2.buildingColor(ColorEnum.RED);
        house2.numberOfResidents(75);
        house2.numberOfWindows(43);
        System.out.println(house2);
        System.out.printf("%.2f%n", house2.calculateMonthlyRevenue(3.75, 1395.93));
    }
}
