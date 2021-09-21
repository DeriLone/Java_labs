public class ArrayClass {
    private int size;

    private Object[][] matrix;

    public ArrayClass(int size) {
        this.size = size;
        matrix = new Object[size][size];
    }

    public void FillingArray() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = (int) (Math.random() * 9);
            }
        }
    }

    public void PrintArray(){
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public void PrintSideDiagonal(){
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if( size == (i + j + 1))
                    System.out.print(matrix[i][j] + " ");
            }
        }
    }
}
