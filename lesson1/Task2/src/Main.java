public class Main {
    private static int[] array;

    public static void main(String[] args) {
        int[] ar = fillArray(0, 10, 2);
        PrintArray(ar);
        ar = fillArray(3, 15, 4);
        PrintArray(ar);

    }

    private static int[] fillArray(int begin, int end, int step){
        int size = (end - begin) / step + 1;
        array = new int[size];
        int counter = 0;
        for (int i = begin; i <= end; i+=step) {
            array[counter] = i;
            counter++;
        }
        return array;
    }

    public static void PrintArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }
}
