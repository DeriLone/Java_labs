import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("--> ");
        String expression = scanner.nextLine();
        calculate(expression);
    }

    public static void calculate(String exp) throws Exception {
        String[] numbers = exp.split("[+\\-*/]");
        String[] operation = exp.split("\\d");

        System.arraycopy(operation, 1, operation, 0, operation.length - 1);
        double result = Double.parseDouble(numbers[0]);

        for (int i = 0; i < operation.length - 1; i++) {
            switch (operation[i]){
                case "+":
                    result += Double.parseDouble(numbers[i + 1]);
                    break;
                case "-":
                    result -= Double.parseDouble(numbers[i + 1]);
                    break;
                case "*":
                    result *= Double.parseDouble(numbers[i + 1]);
                    break;
                case "/":
                    result /= Double.parseDouble(numbers[i + 1]);
                    break;
                default:
                    throw new Exception("Something went wrong");
            }
        }

        System.out.println(result);
    }
}
