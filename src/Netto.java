import java.util.Scanner;
public class Netto {
    public static void main (String []args){
        double Betrag, Mwst, Nettob;
        System.out.println("Brutto: ");
        Scanner sc = new Scanner(System.in);
        Betrag = sc.nextDouble();
        Mwst = Betrag * 0.19;
        System.out.println("Mwst: " +Mwst);
        Nettob = Betrag + Mwst;
        System.out.println("Netto: "+Nettob);
    }
}
