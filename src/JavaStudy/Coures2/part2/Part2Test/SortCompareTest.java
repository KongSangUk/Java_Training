package JavaStudy.Coures2.part2.Part2Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortCompareTest {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("공상욱", "곰삼묵", "욱상공");
        Collections.sort(names, String::compareTo);
        System.out.println(names);
        for (String name : names){
            System.out.println(name);
        }
    }
}
