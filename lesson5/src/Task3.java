import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder line = new StringBuilder();

        while (true){
            System.out.println(
                    "What to do?\n1. add/delete word\n2. View all\n3. Close app");
            System.out.print("--> ");
            String input = scanner.nextLine();

            switch (input){
                case "1":
                    System.out.print("Write word (+/-) --> ");
                    input = scanner.nextLine();
                    char symbol = input.charAt(0);
                    input = input.replace(symbol, ' ');

                    if (symbol == '+') {
                        line.append(input);
                        break;
                    } else if (symbol == '-') {
                        if(!line.toString().contains(input)){ break; }
                        line = new StringBuilder(line.toString().replace(input, ""));
                        break;
                    } else {
                        System.out.println("Bad input");
                        break;
                    }
                case "2":
                    System.out.println(line);
                    break;
                case "3":
                    return;
                default:
                    System.out.println("Bad input");
                    break;
            }
        }
    }
}
