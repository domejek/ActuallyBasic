import java.util.Scanner;
public class Getränk {
    public static void main (String[]args){
        double Zahl;
        System.out.println("Zahl:");
        Scanner sc = new Scanner(System.in);
        Zahl = sc.nextDouble();
        if (Zahl > 18){
            System.out.println("Ein Bier");
        }
        else{
            System.out.println("Eine Limo");
        }
    }
}
