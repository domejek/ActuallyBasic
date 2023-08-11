import java.util.Scanner;
public class Kennwort {
    public static void main (String []argv){
        String CheckWord = "Hia";
        String Word;
        System.out.println("Wort: ");
        Scanner sc = new Scanner(System.in);
        Word = sc.nextLine();
        if (Word == CheckWord){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
