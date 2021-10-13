package exercise;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Exercise7 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        while(set.size()<6){
            int tmp = (int) (Math.random()*45+1);
            set.add(tmp);
        }

        set.stream().sorted().forEach(System.out::println);

        System.out.println("-----------------------------");

        IntStream.generate(()->(int)(Math.random()*45+1))
                .distinct()
                .limit(6)
                .sorted()
                .forEach(System.out::println);

    }
}
