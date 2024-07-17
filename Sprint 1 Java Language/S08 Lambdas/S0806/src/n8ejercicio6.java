import java.util.*;


public class n8ejercicio6 {
    public static void main(String[] args) {

    List<Object> listChar = new ArrayList<>();

        listChar.add("casa");
        listChar.add(4);
        listChar.add(3.135);
        listChar.add("armario");
        listChar.add("luna");
        listChar.add("bicicleta");
        listChar.add(825478);
        listChar.add("esternocleidomastoideo");


        listChar.sort((a,b)-> a.toString().length()-b.toString().length());
        System.out.println("Ordenación de menor a mayor:");
        listChar.forEach(System.out::println);











    }
}