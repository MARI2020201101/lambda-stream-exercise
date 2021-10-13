package exercise;

import java.util.Arrays;

public class Exercise5 {

    static void answer(String[] arr){
        int sum = Arrays.stream(arr).mapToInt(a->a.length()).sum();
        System.out.println("sum = " + sum);
    }
    public static void main(String[] args) {

        String[] arr = {"aaa","bb","c","dddd"};

        int length = Arrays.stream(arr).reduce((a,b)->a+b).get().length();
        System.out.println("sum = "+length);
        answer(arr);
    }
}
