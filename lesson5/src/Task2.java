public class Task2 {
    private static final int arraySize = 7;

    public static void main(String[] args) {
        int[] array = new int[arraySize];
        int halfArray = arraySize / 2;
        int counter = halfArray;

        for (int i = 0; i < arraySize; i++) {
            if(i < halfArray){
                array[i] = counter;
                counter--;
                continue;
            }
            array[i] = counter;
            counter++;
        }

        for (int i = 0; i < arraySize; i++) {
            System.out.print(array[i]);
        }
    }
}
