import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        // tombola natalizia

        /* todo2:
        - Generare ulteriori 15 numeri dall'1 al 90 diversi tra loro (che rappresentano la scheda della tombola).
        - I numeri della scheda devono essere visualizzati sullo schermo appena parte il programma
        - mano a mano che i numeri della parte 1 vengono estratti, bisogna evidenziare i numeri della scheda che corrispondono (ad esempio racchiudendoli tra parentesi quadre)
        - il programma termina quando tutti i numeri della scheda sono stati estratti (Tombola!)

        */

        Random r = new Random();

        // creo un array di booleani in cui salvare i numeri usciti di dimensioni 90
        boolean[] nEstratti = new boolean[90];

        // loop della generazione numero
        for (int i = 0; i < 90; i++) {
            int pescata = r.nextInt(90)+1;
            // controllo che il numero non sia già uscito, altrimenti rimuovo l'iterazione così continua fino a quando non escono tutti e 90 i numeri
            if (!nEstratti[pescata - 1]) {
                System.out.println("È uscito il numero: "+ pescata);
                nEstratti[pescata - 1] = true;
            } else {
                System.out.println("Numero già uscito");
                i--; };
        
        
        };

        

    }
}
