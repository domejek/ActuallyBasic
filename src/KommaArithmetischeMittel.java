import java.util.Scanner;
import java.util.Arrays;
public class KommaArithmetischeMittel {
    public static void main (String[]argv){
        int anzahl;
        double summe = 0.0;
        System.out.println("Anzahl:");
        Scanner sc = new Scanner(System.in);
        anzahl = sc.nextInt();
        for (int i = 1; i <= anzahl; i++) {
            System.out.print("Zahl " + i + ": ");
            summe += sc.nextDouble();
        }
        double mittel = summe / anzahl;
        System.out.println("Das arithmetische Mittel ist: " + mittel);
        sc.close();
    }
}
