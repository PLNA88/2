import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćwiczenie 3 switch case */

        /* zad.1 napisać program który przyjmuje jedną liczbę od użytkownika z klawiatury
          i za pomocą switch case default ma określić czy:
          a) ta liczba jest parzysta --> podpowiedz switch(a % 2) {
          b) program który określi czy liczba jest podzielna przez 7
         */

        System.out.println("zad. 1a");
        Scanner liczbaA = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");
        int a = liczbaA.nextInt();
        switch (a % 2) {
            case 0:
                System.out.println("Ta liczba jest parzysta.");
                break;
            default:
                System.out.println("Ta liczba jest nieparzysta.");
        }
        System.out.println("zad. 1b");
        Scanner liczbaB = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");
        int b = liczbaB.nextInt();
        switch (b % 7) {
            case 0:
                System.out.println("Ta liczba jest podzielna przez 7.");
                break;
            default:
                System.out.println("Ta liczba nie jest podzielna przez 7.");
        }

        /* zad.2
           a) napisać program podobny do programu z przykładu, który ma zliczyć iloś liter 'o', 'p', 'x', 'z', 'q' w wyrazie:
            "ooooozjoonoxoooozoooooooooozoxooooopnpppoooiiooooomnzooooxoqoojoozoootyoooozoooxoooozooooxooooooojoooopxoooonnmooo"
           b) oraz ma określić ile jest pozostałych liter, które nie należą do: 'o', 'p', 'x', 'z', 'q'
         */

        System.out.println("\nzad. 2a");
        String text = "ooooozjoonoxoooozoooooooooozoxooooopnpppoooiiooooomnzooooxoqoojoozoootyoooozoooxoooozooooxooooooojoooopxoooonnmooo";
        int[] tablicaA = {0, 0, 0, 0, 0};
        for (char zmiennaChar : text.toCharArray()) {
            switch (zmiennaChar) {
                case 'o':
                    ++tablicaA[0];
                    break;
                case 'p':
                    ++tablicaA[1];
                    break;
                case 'x':
                    ++tablicaA[2];
                    break;
                case 'z':
                    ++tablicaA[3];
                    break;
                case 'q':
                    ++tablicaA[4];
                    break;
            }
        }
        System.out.printf("Licznik liter:\n'o' - %d\n'p' - %d\n'x' - %d\n'z' - %d\n'q' - %d",
                tablicaA[0], tablicaA[1], tablicaA[2], tablicaA[3], tablicaA[4]);


        System.out.println("\n\nzad. 2b");
        String textB = "ooooozjoonoxoooozoooooooooozoxooooopnpppoooiiooooomnzooooxoqoojoozoootyoooozoooxoooozooooxooooooojoooopxoooonnmooo";
        int[] tablicaB = {0, 0};
        for (char zmiennaChar : textB.toCharArray()) {
            switch (zmiennaChar) {
                case 'o', 'p', 'x', 'z', 'q':
                    ++tablicaB[0];
                    break;
                default:
                    ++tablicaB[1];
            }
        }
        System.out.printf("Ilość pozostałych liter: %d",tablicaB[1]);
    }
}