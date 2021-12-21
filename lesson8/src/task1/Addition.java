package task1;

import task1.Adding;

public class Addition {
    @Adding(a = 2, b = 5)
    public void addit(int a, int b){
        System.out.println(a + b);
    }
}