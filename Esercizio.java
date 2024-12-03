import java.util.Random;
import java.util.Scanner;

class Esercizio {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();

        int n;
        int i;
        int j;
        int t;

        do {
            System.out.println("Inserire la dimensione del vettore: ");
            n = in.nextInt();
        } while (n <= 0);

        int[] u = new int[n];
        int[] r = new int[n];
        int[] s = new int[n];
        float[] m = new float[n];

        for (i = 0; i < n; i++) {
            do {
                System.out.println("Inserire l'elemento numero " + (i + 1) + " del vettore: ");
                u[i] = in.nextInt();
            } while (u[i] < 0);
        }

        for (i = 0; i < n; i++) {
            r[i] = random.nextInt(11);
        }

        for (i = 0; i < n; i++) {
            s[i] = random.nextInt(6) + 3;
        }

        for (i = 0; i < n; i++) {
            m[i] = (float) (u[i] + r[i] + s[i]) / 3;
        }

        System.out.println("Inserire un numero intero: ");
        t = in.nextInt();

        for (i = 0; i < n; i++) {
            for (j = i + 1; j < n; j++) {
                if (u[i] + u[j] == t) {
                    System.out.println(u[i] + " + " + u[j] + " = " + t);
                }
            }
        }
    }
}
