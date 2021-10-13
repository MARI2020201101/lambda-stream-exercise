package exercise;

import java.util.Arrays;

public class Exercise6 {
    public static void main(String[] args) {
        String[] arr = {"aaa","bb","c","dddd"};

        int max = Arrays.stream(arr).mapToInt(a->a.length()).max().getAsInt();
        int max2 = Arrays.stream(arr).mapToInt(String::length).max().getAsInt();
        System.out.println(max);
        System.out.println(max2);
    }
}
