public class Main {
    private static int size = 5;


    public static int[][] FillingArray(int[][] matrix) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = (int) (Math.random() * 9);
            }
        }
        return matrix;
    }

    private static void printArray(int[][] matrix){
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public static void PrintSideDiagonal(int[][] matrix){
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if( size == (i + j + 1))
                    System.out.print(matrix[i][j] + " ");
            }
        }
    }


    public static void main(String[] args) {
        int[][] matrix = new int[size][size];
        matrix = FillingArray(matrix);
        printArray(matrix);
        PrintSideDiagonal(matrix);
    }
}
