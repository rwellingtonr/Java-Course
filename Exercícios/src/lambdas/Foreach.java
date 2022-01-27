package lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {

    public static void main(String[] args) {
        List<String> approved = Arrays.asList("Wellington", "Ana", "Gabriela");

        System.out.println("Forma tradicional");

        for (String name : approved) {
            System.out.println("name:" + name);
        }
        System.out.println("\nLambda");
        approved.forEach(name -> System.out.println(name));

        System.out.println("\nReference method");
        approved.forEach(name -> myPrint(name));

        System.out.println("\nOther method");
        approved.forEach(Foreach::myPrint);
    }

    static void myPrint(String name) {
        System.out.println("Hello, my name is " + name);
    }

}
