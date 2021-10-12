package exercise;

import java.util.Arrays;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Exercise4 {

    //6이면, filter해서 출력한다

    static void printSum6Dice(int[] dice , BiConsumer<Integer,Integer> bc, BiPredicate<Integer,Integer> bp){

    }


    public static void main(String[] args) {
        final int[] dice = {1,2,3,4,5,6};

        Stream.of(1,2,3,4,5,6)
                .flatMap(d->Stream.of(1,2,3,4,5,6).map(d2->new int[]{d2,d}))
                .filter(i->i[0] + i[1]==6)
                .forEach(i-> System.out.println(Arrays.toString(i)));



        BiConsumer<Integer,Integer> biConsumer = new BiConsumer<Integer, Integer>() {
            @Override
            public void accept(Integer a, Integer b) {
                System.out.println("[ "+a+ " , " + b + " ]");
            }
        };

        BiPredicate<Integer,Integer> biPredicate = new BiPredicate<Integer, Integer>() {
            @Override
            public boolean test(Integer a, Integer b) {
                return a+b==6;
            }
        };


    }
}
