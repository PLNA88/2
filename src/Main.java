import java.util.Scanner;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void metodaPierwszeB(ArrayList<String> lista1)
    {
        System.out.println("\nWprowadzone nazwy zwierząt:");
        for (var zwierze: lista1)
        {
            System.out.println(zwierze);
        }
        System.out.println();
    }
    public static void metodaPierwszeC(ArrayList<String> lista1)
    {
        System.out.println("\nWprowadzone nazwy zwierząt:");
        for (var zwierze: lista1)
        {
            System.out.println(zwierze);
        }
        System.out.println();
        System.out.println("Ilość wprowadzonych zwierząt: "+lista1.size());
    }

    public static void main(String[] args) {

        /* ćw_6 Listy */
        /* zad.1 a) Napisać program który stworzy listę ArrayList<String> (lista tablicowa),
                Proszę dane wprowadzać z klawiatury (można użyć pętli), lista ma mieć przynajmniej 5
                elementów i elementami mają być nazwy zwierząt.
                b) proszę stworzyć metodę która będzie miała pętle forEach i będzie wyświetlała elementy Listy
                -- podpowiedź: for(String zmienna : List<String>)
                c) proszę usunąć 2 ostatnie elementy listy i dodać do niej 3 inne elementy,
                następnie wyświetlić listę i wielkość listy,
                d) następnie proszę wykonać odwrotne sortowanie i znów użyć metody z punktu b) do wyświetlenia
                elementów listy
          */
         /* zad.2 Napisać program który stworzy Set<Integer> i wprowadzamy 10 liczb z klawiatury
                niech liczby się powtarzają, proszę posortować a następnie wyświetlić zawartość set-a w konsoli
                 a następnie przeiterować i wyświetlić forEach-em (jak wyżej)
         */

        System.out.println("zad. 1");
        ArrayList<String> lista1 = new ArrayList<>();
        Scanner z = new Scanner(System.in);
        for (int i = 0; i <6; ++i)
        {
            System.out.println("Wprowadź nazwę zwierzęcia:");
            lista1.add(z.next());
        }

        metodaPierwszeB(lista1);

        lista1.remove(lista1.size()-1);
        lista1.remove(lista1.size()-1);
        lista1.add("krowa");
        lista1.add("baran");
        lista1.add("kogut");
        metodaPierwszeC(lista1);

        lista1.sort(Collections.reverseOrder());
        metodaPierwszeB(lista1);

        System.out.println("\nzad. 2");
        Set<Integer> set2 = new TreeSet<>();
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < 10; i++)
        {
            System.out.println("Podaj element:");
            set2.add(s.nextInt());
        }
        System.out.println("\nWprowadzone wartości: "+set2);
        set2.forEach(System.out::println);
    }
}