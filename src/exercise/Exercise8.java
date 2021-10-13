package exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

class Student{
    String name;
    boolean isMale;
    int hak;
    int ban;
    int score;

    public Student(String name, boolean isMale, int hak, int ban, int score) {
        this.name = name;
        this.isMale = isMale;
        this.hak = hak;
        this.ban = ban;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public boolean isMale() {
        return isMale;
    }

    public int getHak() {
        return hak;
    }

    public int getBan() {
        return ban;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", isMale=" + isMale +
                ", hak=" + hak +
                ", ban=" + ban +
                ", score=" + score +
                '}';
    }
    enum Level{
        HIGH,MID,LOW;
    }
}

public class Exercise8 {
    public static void main(String[] args) {

        Student[] arr = {
                new Student("나자바",true,1,1,300),
                new Student("김지미",false,1,1,250),
                new Student("김자바",true,1,1,200),
                new Student("이지미",false,1,2,150),
                new Student("남자바",true,1,2,100),
                new Student("안지미",false,1,2,50),
                new Student("황지미",false,1,3,100),
                new Student("강지미",false,1,3,150),
                new Student("이자바",true,1,3,200),

                new Student("나자바",true,2,1,300),
                new Student("김지미",false,2,1,250),
                new Student("김자바",true,2,1,200),
                new Student("이지미",false,2,2,150),
                new Student("남자바",true,2,2,100),
                new Student("안지미",false,2,2,50),
                new Student("황지미",false,2,3,100),
                new Student("강지미",false,2,3,150),
                new Student("이자바",true,2,3,200)
        };


        Map<Boolean, Map<Boolean, Long>> collect = Arrays.stream(arr)
                .collect(partitioningBy(Student::isMale
                                , partitioningBy(s -> s.getScore() < 150, counting())));

        System.out.println(collect.get(true).get(true));
        System.out.println(collect.get(false).get(true));


    }
}
