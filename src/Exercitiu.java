import java.util.ArrayList;
import java.util.Scanner;

public class Exercitiu {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu text");
        String text;

        //solutia1
        ArrayList<String> textUntilEnough = new ArrayList<>();

        do {
            text = scanner.nextLine();
            textUntilEnough.add(text);
        } while (!text.equals("Enough!"));
        if (textUntilEnough.size() == 1) {
            System.out.println("No text provided");
            System.out.println(textUntilEnough);
            String longestString = textUntilEnough.get(0);
            for (int i = 1; i < textUntilEnough.size(); i++) {
                if (longestString.length() < textUntilEnough.get(i).length()) {
                    longestString = textUntilEnough.get(i);

                    //solutia2
//        while(true){
//            String text = scanner.nextLine();
//            if(text.equals("Enough!")){
                    //               break;
//            }
//        }
                }
            }
        }
    }
}