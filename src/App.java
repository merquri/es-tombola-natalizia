import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        // tombola natalizia

        /*
         * todo2:
         * - mano a mano che i numeri della parte 1 vengono estratti, bisogna
         * evidenziare i numeri della scheda che corrispondono (ad esempio
         * racchiudendoli tra parentesi quadre)
         * - il programma termina quando tutti i numeri della scheda sono stati estratti
         * (Tombola!)
         * 
         */

        Random r = new Random();

        // provo questo metodo:
        // creo un array di boolean per prendere 15 numeri diversi
        boolean[] schedaUnoCheck = new boolean[90];

        // creo un array per memorizzare i numeri estratti
        int[] schedaUno = new int[15];

        // cerco i numeri
        for (int i = 0; i < 15; i++) {
            int pescata = r.nextInt(90) + 1;
            // controllo che il numero non sia già uscito, altrimenti rimuovo l'iterazione
            // così continua fino a quando non si riempie
            if (!schedaUnoCheck[pescata - 1]) {
                schedaUnoCheck[pescata - 1] = true;
                schedaUno[i] = pescata; // aggiungo alla scheda
            } else {
                i--;
            }
            ;
        }

        // mostro la scheda
        System.out.println("Giochiamo a tombola!");
        System.out.println("La tua scheda ha i seguenti numeri:");

        for (int i = 0; i < 15; i++) {
            System.out.print(schedaUno[i]);
            System.out.print(" ");
        }

        System.out.println("\nEstraggo i numeri!\n");

        // creo un array di booleani in cui salvare i numeri usciti di dimensioni 90
        boolean[] nEstratti = new boolean[90];

        // loop della generazione numero
        for (int i = 0; i < 90; i++) {
            int pescata = r.nextInt(90) + 1;
            // controllo che il numero non sia già uscito, altrimenti rimuovo l'iterazione
            // così continua fino a quando non escono tutti e 90 i numeri
            if (!nEstratti[pescata - 1]) {
                System.out.println("È uscito il numero: " + pescata);
                nEstratti[pescata - 1] = true;
            } else {
                i--;
            }
            ;

        }
        ;

    }
}
