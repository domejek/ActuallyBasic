import java.util.Scanner;
public class Komma {
    public static void main (String []args){
        String eingabe="";
        int zahl;
        double kommazahl = 0.0;
        System.out.println("Kommazahl: ");
        Scanner sc = new Scanner(System.in);
        eingabe = sc.nextLine();
        kommazahl=Double.parseDouble(eingabe);
        zahl = (int)kommazahl;
        System.out.println(zahl);
    }
}
