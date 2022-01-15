import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static int[] metodaPierwszeB (int x){
        int[] tab = new int[x];
        int y = 40;
        for (int i = 0; i < x; ++i)
        {
            tab[i] = y-i;
        }
        return tab;
    }
    public static void metodaPierwszeC(int[] wartosc){
        for (int i:wartosc
        ) {
            System.out.println(i);
        }
    }

    public static String[] metodaDrugieB(int x){
        String[] tab =new String[x];
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < x; ++i)
        {
            System.out.println("Wprowadź wartość numer "+(i+1)+":");
            tab[i] = s.nextLine();
        }
        return tab;
    }
    public static void metodaDrugieC(String[] tab){
        System.out.println("\nWprowadzone wartości: ");
        for (int i=5;i>=0;--i)
        {
            System.out.println(tab[i]);
        }
    }

    public static void metodaTrzecie(String Imie){
        System.out.println(Imie);
    }
    public static void metodaTrzecie(String Imie, String Nazwisko) {
        System.out.println(Imie + " " + Nazwisko);
    }
    public static void metodaTrzecie(String Imie, String Nazwisko, int wiek){
        System.out.println(Imie + " " + Nazwisko + " " + wiek);
    }

    public static int metodaCzwarte(int A, int B){
        return A + B;
    }
    public static int metodaCzwarte(int A, int B, int C){
        return A + B + C;
    }

    public static void main(String[] args) {
        /* ćwiczenie 5 Metody */
        /* zad.1
        a) stworzyć tablicę typu int[20],
        b) napisać metodę która będzie uzupełniała tablicę wartościami od 40 do 21,
        c) napisać metodę, która wypisze otrzymane wartości,
        d) wstawić wywołanie metody do metody main
        */
        /* zad.2
        a) stworzyc tablicę typu String[6],
        b) napisać metodę która uzupełni tablicę wartościami podawanymi z klawiatury
            (użyć do tego pętli i klasy Scanner),
        c) napisać metodę która wyświetli elementy tablicy od ostatniego elementu do elementu o indeksie 0,
        */
        /* zad.3
        a) napisać metodę która przyjmuje 1 parametr typu String, metoda nic nie zwraca, tylko
            wyświetla w konsoli string który ma być waszym imieniem,
        b) napisać metodę o tej samej nazwie jak w punkcie a) z 2-oma parametrami typu String, która wyświetli
            wasze imie i nazwisko,
        c) napisać metodę o tej samej nazwie jak w punkcie a) i b) która przyjmuje wasze imie,
            nazwisko i wiek (int), a następnie wszystko wyświetli,
        */
        /* zad.4
        a) napisać metodę która przyjmuje 2 parametry typu int i zwraca ich sumę, którą przypiszemy do zmiennej,
            coś takiego:                                    zmiennaA = metoda(1, 2); <-- wywołanie metody
        b) napisać metodę (nazwa ta sama co w punkcie a) która przyjmuje 3 parametry typu int i zwraca ich sumę,
            którą przypiszemy do zmiennej, coś takiego:     zmiennaB = metoda(7, 8, 9); <-- wywołanie metody
        c) wyświetlić sumę wywołań obu metod ---> print("wynik: " + (metoda(8, 9) + metoda(2, 3, 4));
        */

        System.out.println("zad. 1");
        int[] tablica1 =new int[20];
        tablica1=metodaPierwszeB(20);
        metodaPierwszeC(tablica1);

        System.out.println("\nzad. 2");
        String[] tablica2 = new String[6];
        tablica2=metodaDrugieB(6);
        metodaDrugieC(tablica2);

        System.out.println("\nzad. 3");
        metodaTrzecie("Paulina","Gigowska",23);

        System.out.println("\nzad. 4");
        System.out.println("Suma wartości z obu metod: " + (metodaCzwarte(5, 5) + metodaCzwarte(2, 2, 2)));
    }
}