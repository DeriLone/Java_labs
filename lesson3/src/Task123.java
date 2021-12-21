import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.IntFunction;
import java.util.stream.Collectors;

public class Task123 {
    public static void main(String[] args) {
        Task1();
        Task2();
        Task3();
    }

    public static void Task1(){
        List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");
        myList.stream().filter(s -> s.contains("c")).map(s -> s.toUpperCase(Locale.ROOT)).sorted().forEach(System.out::println);
    }

    public static void Task2(){
        int ArraySize = 10;
        int[] myArray = new int[ArraySize];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int)(Math.random() * 9);
        }
        System.out.println(Arrays.stream(myArray).filter(s -> s % 2 == 0).average().getAsDouble());
    }

    public static void Task3(){
        String str = "sjdhgfsjkavchjwagehf";
        StringBuilder newStr = new StringBuilder();
        Arrays.stream(str.split("")).forEach(x -> {
            if (x.matches("[h-t]")) {
                x = x.toUpperCase(Locale.ROOT);
            }
            newStr.append(x);
        });
        System.out.println(newStr);
    }
}
