import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        /* ćw.2 pętle for */

        /* zad.1 Napisz program który będzie iterował od 100 do 0,
         *  i wyświetlał liczby które są podzielne przez ostatnią cyfrę waszego indeksu
         * (jesli tą liczbą jest 0 to przez 2 ostatnie) */

        System.out.println("zad. 1");
        for (int i = 100; i>0; i--) {
            if (i%14==0) {
                System.out.println(i);
            }
        }

        /* zad.2 Napisz program który będzie uzupełniał tablicę 5-cio elementową int[] liczbami
         * wprowadzanymi z klawiatury (użyć klasy Scanner), a następnie będzie wyświetlał elementy tablicy
         * za pomocą pętli forEach powiększone o 11 */

        System.out.println("\nzad. 2");
        int[] tabliczka = new int[5];

        Scanner scan = new Scanner(System.in);
        System.out.println("Poniżej podaj pięć elementów tablicy: ");
        int n0 = scan.nextInt();
        tabliczka[0] = n0;
        int n1 = scan.nextInt();
        tabliczka[1] = n1;
        int n2 = scan.nextInt();
        tabliczka[2] = n2;
        int n3 = scan.nextInt();
        tabliczka[3] = n3;
        int n4 = scan.nextInt();
        tabliczka[4] = n4;

        for (int element : tabliczka) {
            System.out.print(11+element + ", ");
        }
    }
}