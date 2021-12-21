import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        String[] arr = new String[]{ "Don`t", "worry", ",", "be", "happy!"};
        Arrays.stream(arr).forEach(el -> System.out.print(el + " "));
        System.out.println("");

        StringBuilder reversedLine = new StringBuilder();
        Arrays.stream(arr).forEach(reversedLine::append);
        reversedLine.reverse();

        StringBuilder newArrElement = new StringBuilder();
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length(); j++) {
                newArrElement.append(reversedLine.charAt(counter));
                counter++;
            }
            arr[i] = newArrElement.toString();
            newArrElement.delete(0, arr[i].length());

        }
        Arrays.stream(arr).forEach(el -> System.out.print(el + " "));
    }
}
