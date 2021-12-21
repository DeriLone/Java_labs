import java.util.Random;

public class Task1 {
    private static final int size = 5;

    public static void main(String[] args) {
        int[][] matrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = new Random().nextInt(10);
            }
        }

        printArray(matrix);
        System.out.println("\n");
        printSideDiagonal(matrix);
    }

    private static void printArray(int[][] arr){
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("\n");
        }
    }

    public static void printSideDiagonal(int[][] arr){
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if(size == (i + j + 1))
                    System.out.print(arr[i][j] + " ");
            }
        }
    }

}
