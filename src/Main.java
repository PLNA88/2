public class Main {

    public static void main(String[] args) {
        /* cw.1 pętle while */

        /* zad 1 - Napisać za pomocą pętli do-while kod który będzie iterował od liczby 1000 w dół do 0.
          Jeśli liczba będzie podzielna przez 2 ostatnie cyfry waszego indeksu (podać nr indesu z uczelni)
          to dać komunikat "liczba XX podzielna przez YY" (XX-liczba podzielna YY-podzielnik)
        */
        System.out.println("zad. 1");
        int i = 100;
        do {
            System.out.println(i);
            if (i%14==0) {
                System.out.println("liczba "+ i + " podzielna przez 14");
            }
        } while (--i >= 0);

        /* zad 2
        a) stworzyć tablicę typu int wielkosci 5, przypisac jej dowolne wartości,
          przeiterować tablicę po elementach i wyswietlić, użyć pętli while
        b) jak wyżej tylko dla tablicy typu double[],
        c) jak wyżej dla tablicy String[], przeiterować i wyświetlić od ostatniego elementu
        */
        System.out.println("\nzad. 2a");
        int[] tablicaA = {28, 67, 86, 50, 34};
        for (int a = 0; a < tablicaA.length; a++) { System.out.print(tablicaA[a] + ", ");
        }
        System.out.println("\nzad. 2b");
        double[] tablicaB = {28.28, 67.67, 86.86, 50.50, 34.34};
        for (int b = 0; b < tablicaB.length; b++) { System.out.print(tablicaB[b] + ", ");
        }
        System.out.println("\nzad. 2c");
        String[] tablicaC = {"Two", "Six", "Eight", "Five", "Three"};
        for (int c = tablicaC.length - 1; c >= 0 ; c--) { System.out.print(tablicaC[c] + ", ");
        }

        /* zad.3
        a) sprawdzić jak zachowuje się pętla while gdy w jej warunku damy true --> while(true)
        b) a jak gdy damy false --> while(false)
        */
        System.out.println("\nzad. 3");

        while (true) {
            System.out.println("nieskonczoność");
        }
        while (false) {
            System.out.println("error");
        }
    }
}