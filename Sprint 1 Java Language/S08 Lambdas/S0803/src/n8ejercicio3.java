import java.util.*;
import java.util.Collection;

public class n8ejercicio3 {
    public static void main(String[] args) {

        List<String> monthList = new ArrayList<>();

        monthList.add("january");
        monthList.add("february");
        monthList.add("march");
        monthList.add("april");
        monthList.add("may");
        monthList.add("june");
        monthList.add("july");
        monthList.add("agost");
        monthList.add("september");
        monthList.add("october");
        monthList.add("november");
        monthList.add("december");

        monthList.forEach((months->System.out.println(months)));
    }
}