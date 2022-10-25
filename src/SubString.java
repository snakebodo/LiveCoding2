import java.util.Scanner;

public class SubString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String text1 = scanner.nextLine();
        String text2 = scanner.nextLine();
        //sa afisam concatenarea celor 2 texte ignorand primul caracter
        // Exemplu : "Hello", "There" -> "ellohere"

        text1 = text1.substring(1);
        text2 = text2.substring(1);
        System.out.println(text1 + text2);
    }
}
