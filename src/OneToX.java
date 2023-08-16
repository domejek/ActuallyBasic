import java.util.Scanner;
public class OneToX {
    public static void main (String[]argv){
        double zahl;
        System.out.println("Zahl:");
        Scanner sc = new Scanner(System.in);
        zahl = sc.nextDouble();
        for(int i=1; i <= zahl; i++){
            System.out.println(i);
        }
    }
}
