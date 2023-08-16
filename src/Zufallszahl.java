import java.util.Scanner;
import java.util.Random;
public class Zufallszahl {
    public static void main (String []argv){
        double zahl;
        double maxZahl = 99;
        System.out.println("Zufallszahl:");
        Scanner sc = new Scanner(System.in);
        zahl = sc.nextDouble();
        for (int i = 0; i < maxZahl; i++){
            if (zahl == 10){
                break;
            }
            else{
                int random = new Random().nextInt(100);
                System.out.println(random);
            }
        }
    }
}
