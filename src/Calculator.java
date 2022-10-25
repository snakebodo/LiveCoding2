import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        String operation;

        Scanner input = new Scanner(System.in);

        System.out.println("please enter the first number");
        float num1 = input.nextFloat();

        Scanner op = new Scanner(System.in);
        System.out.println("Please enter operation");
        operation = op.nextLine();

        System.out.println("please enter the second number");
        float num2 = input.nextFloat();

        //solutia 1
        if (operation.equals("+")) {
            System.out.println("your answer is " + (num1 + num2));
        }
        if (operation.equals("-")) {
            System.out.println("your answer is " + (num1 - num2));
        }

        if (operation.equals("/")) {
            System.out.println("your answer is " + (num1 / num2));
        }
        if (operation.equals("*")) {
            System.out.println("your answer is " + (num1 * num2));
        }
        if (!operation.equals("+") && !operation.equals("-") && !operation.equals("/") && !operation.equals("*")) {
            System.out.println("Invalid symbol");
        }
        if(num2 ==0){
            System.out.println("Cannot calculate");
        }
    }
}