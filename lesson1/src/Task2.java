import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int begin, end, step;
        System.out.print("Array begin --> ");
        begin = scanner.nextInt();
        System.out.print("Array end --> ");
        end = scanner.nextInt();
        System.out.print("Step --> ");
        step = scanner.nextInt();

        for (int i : fillArray(begin, end, step)) {
            System.out.print(i + " ");
        }
    }

    private static int[] fillArray(int begin, int end, int step){
        int size = Math.abs((end - begin) / step + 1);
        int[] array = new int[size];

        int currentNum = begin;
        for (int i = 0; i < size; i++) {
            array[i] = currentNum;
            currentNum += step;
        }
        return array;
    }
}

