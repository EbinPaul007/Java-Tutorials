package example;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class runner {
    public static void main(String[] args) {
        List<Integer> list = List.of(25, 45, 89, 64, 12, 38, 15, 25);

        int sum = list.stream().filter(element -> element % 2 != 0)
                .reduce(0, (numer1, numer2) -> numer1 + numer2);
        System.out.println(sum);
       int med =list.stream().max((n1,n2)->Integer.compare(n1,n2)).get();
        System.out.println(med);
       List<Integer> hey= IntStream.range(1,11).map(e -> e*e).boxed().collect(Collectors.toList());
        System.out.println(hey);
    }
}