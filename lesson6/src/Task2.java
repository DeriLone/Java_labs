import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        Arrays.stream(findMultiplex(10, 23)).forEach(el -> System.out.print(el + " "));
    }

    private static int[] findMultiplex(int x, int n){
        int[] arr = new int[x];
        int counter = 0;

        for (int i = n; counter < x ; i++) {
            if(i % n == 0){
                arr[counter] = i;
                counter++;
            }
        }
        return arr;
    }
}

