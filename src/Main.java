public class Main {

    public static void main(String[] args) {

        /* cw.4  */

        /* zad.1 napisać 3 pętle for i użyc:
        a) w pierwszej pętli break
        b) w drugiej pętli continue
        c) w trzeciej pętli return
        */

        System.out.println("zad. 1a");
        for (int i = 100; i >= 0; i--) {
            if (i == 62)
                break;
            System.out.print(i + ", ");
        }

        System.out.println("\n\nzad. 1b");
        for (int i = 50; i >= 0; i--) {
            if (i % 2 == 0)
                continue;
            System.out.print(i + ", ");
        }

        System.out.println("\n\nzad. 1c");
        for (int i = 100; i >= 0; i--) {
            if (i == 62)
                return;
            System.out.print(i + ", ");
        }
    }
}