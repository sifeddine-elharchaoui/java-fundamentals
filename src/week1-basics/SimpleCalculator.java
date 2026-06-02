import java.util.Scanner;

public class SimpleCalculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        double num1 = sc.nextDouble();
        System.out.println("Enter operator (+, -, *, /, %): ");
        String operator = sc.next();
        System.out.println("Enter number 2");
        double num2 = sc.nextDouble();

        switch (operator){
            case "+" -> System.out.println(num1 + " + " + num2 +" = " + (num1 + num2)   );
            case "-" -> System.out.println(num1 + " - " + num2 +" = " + (num1 - num2)   );
            case "*" -> System.out.println(num1 + " * " + num2 +" = " + (num1 * num2)   );
            case "/" -> {
                if(num2==0) System.out.println("Cannot divide by zero ");
                else System.out.println(num1 + " / " + num2 +" = " + (num1 / num2));
            } case "%" -> {
                if(num2==0) System.out.println("Cannot divide by zero ");
                else System.out.println(num1 + " % " + num2 +" = " + (num1 % num2));
            }

            default -> System.out.println("Unknown operator");
        }
        sc.close();


    }
}