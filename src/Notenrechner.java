import java.util.Scanner;
public class Notenrechner {
    public static void main (String []argv){
        // 1: 100-92%
        // 2: 91-81%
        // 3: 80-67%
        // 4: 66-50%
        // 5: 49-30%
        // 6: 29-0%
        double maxZahl, erreichteZahl, result;

        System.out.println("maximale Zahl: ");
        Scanner sc = new Scanner(System.in);
        maxZahl = sc.nextDouble();
        System.out.println("erreichte Zahl: ");
        sc = new Scanner(System.in);
        erreichteZahl = sc.nextDouble();
        result = maxZahl/erreichteZahl;
        if (result >29) {
            System.out.println("6");
        } else if (result <49) {
            System.out.println("5");
        } else if (result <66) {
            System.out.println("4");
        } else if (result <80) {
            System.out.println("3");
        } else if (result <91) {
            System.out.println("2");
        }else {
            System.out.println("1");
        }

    }
}
