import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* zad.1
        a) stworzyć tablicę 6-cio elementową, uzupełnić przykładowymi wartościami (dowolny typ tablicy),
        b) wprowadzić z klawiatury numer indexu tablicy który chcemy wyświetlić, użyć metody next() --> scan.next();
        c) zabezpieczyć kod przed wprowadzeniem:
           - za dużej liczby (index > tab.length),
           - wprowadzeniem innego znaku niż liczba,
        d) użyć metody finally aby wyświetlić komunikat zakończenia programu
        e) wprowadzanie indeksu niech będzie zapętlone do momentu wprowadzenia poprawnego indeksu

           PODPOWIEDZI:
           scan.next() - można wprowadzać dowolny znak z klawiatury,
           index = Integer.parseInt(scan.next()); - parsowanie zmiennej do typu int (liczbowego calkowitego)

           warto stworzyć flagę np. isIndexCorrect = false, i niech pętla sie wykonuje, dopuki flaga jest false,
           boolean isIndexCorrect
           white(!isIndexCorrect) {}
        */
        Scanner scanner = new Scanner(System.in);
        int [] tab = new int[6];

        while (true) {
            try {
                tab[scanner.nextInt()] = scanner.nextInt();
            } catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println("Zły indeks");
                continue;
            } catch (InputMismatchException ex) {
                System.out.println("Nie liczba");
                scanner = new Scanner(System.in);
                continue;
            }

            return;
        }


        /* zad.2
        a) stworzyć dowolny przykład z NullPonterException,
        b) stworzyć dowolny przykład z ArithmeticException ,
        c) stworzyć dowolny przykład z 2 lub 3 blokami catch i z blokiem finally,
         */

//        a)
        String str = null;
        str.split("");

//        b)
        System.out.println(53 / 0);

//        c)
        int [] arr;
        try {
            arr = new int[999999999];
        } catch (ExceptionInInitializerError ex) {
            System.out.println("bad");
        } catch (ArrayStoreException ex) {
            System.out.println("hello");
        } finally {
            arr = new int[10];
        }
    }
}
