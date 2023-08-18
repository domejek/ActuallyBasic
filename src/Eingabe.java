import java.util.Scanner;
public class Eingabe {
    public static void main(String[] args) {
        String Vorname, Nachname;
        int Alter;
        System.out.print("Vorname: ");
        Scanner sc = new Scanner(System.in);
        Vorname = sc.nextLine();
        System.out.print("Nachname: ");
        Nachname = sc.nextLine();
        System.out.print("Alter: ");
        Alter = sc.nextInt();
        sc.close();
    }
}