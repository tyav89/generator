import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String string = "a y z b c e";

        System.out.println(getSortList(string, convert()));

    }

    private static Function<String, String[]> convert() {
        return x -> x.split(" ");
    }

    private static List<String> getSortList(String string, Function<String, String[]> function) {
        return Arrays.stream(function.apply(string)).sorted().collect(Collectors.toList());
    }

}
