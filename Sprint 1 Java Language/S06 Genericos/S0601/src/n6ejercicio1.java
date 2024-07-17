
import java.util.*;

public class n6ejercicio1 {
    public static void main(String[] args) {

        NoGenericMethods<String> firstObject = new NoGenericMethods<String>("Casa", "Perro", "Bici");
        NoGenericMethods<Integer> secondObject = new NoGenericMethods<Integer>(1,5,8);
        NoGenericMethods<Double> thirdObject = new NoGenericMethods<Double>(1.6,4.5,7.8);

        System.out.println(firstObject.getObjectOne()+" "+firstObject.getObjectTwo()+" "+firstObject.getObjectThree());
        System.out.println(secondObject.getObjectOne()+" "+secondObject.getObjectTwo()+" "+secondObject.getObjectThree());
        System.out.println(thirdObject.getObjectOne()+" "+thirdObject.getObjectTwo()+" "+thirdObject.getObjectThree());

    }
}