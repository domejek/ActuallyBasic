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
        result = maxZahl/erreichteZahl*100;
        if (result >=92) {
            System.out.println("1");
        } else if (result >=81) {
            System.out.println("2");
        } else if (result >=67) {
            System.out.println("3");
        } else if (result >=50) {
            System.out.println("4");
        } else if (result >=30) {
            System.out.println("5");
        }else {
            System.out.println("6");
        }

    }
}
