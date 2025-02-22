import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter one number: ");
        float a = sc.nextFloat();
        System.out.println("Enter operation: (+, -, /, *)" );
        char operation = sc.next().charAt(0);
        System.out.println("Enter two number: ");
        float b = sc.nextFloat();

        if (operation == '+') {
            float result = a + b;
            System.out.println(a + "+" + b + "=" + result);
        }
        if (operation == '-') {
            float result = a - b;
            System.out.println(a + "-" + b + "=" + result);
        }
        if (operation == '*') {
            float result = a * b;
            System.out.println(a + "*" + b + "=" + result);
        }
        if (operation == '/') {
            float result = a / b;
            System.out.println(a + "/" + b + "=" + result);
        }
    }
}
