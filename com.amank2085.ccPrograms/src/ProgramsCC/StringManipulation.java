package ProgramsCC;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class StringManipulation {
    public static void main(String[] args) {

        String str = "The rains have started here soon";
        System.out.println(str.length());
        System.out.println(str.charAt(5));
        System.out.println(str.indexOf("s"));
        System.out.println(str.indexOf("s", str.indexOf("s") + 1));

        System.out.println();


        char target = 's';
        int occurrence = 3;

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                count++;
                if (count == occurrence) {
                    System.out.println("The 3rd occurrence of 's' is at index: " + i);
                    break;
                }
            }
        }

        if (count < occurrence) {
            System.out.println("The character 's' does not occur " + occurrence + " times in the string.");
        }

        OptionalInt result = IntStream.range(0, str.length())
                .filter(i -> str.charAt(i) == target)
                .skip(occurrence - 1)
                .findFirst();

        if (result.isPresent()) {
            System.out.println("The 3rd occurrence of 's' is at index: " + result.getAsInt());
        } else {
            System.out.println("The character 's' does not occur " + occurrence + " times in the string.");
        }

        //String Comparison
        String str1 = "The rains Have started here soon";
        System.out.println(str.equals(str1));
        System.out.println(str.equalsIgnoreCase(str1));

        //substring
        System.out.println(str.substring(0,9));

        //trim
        String s = "           Hello World          ";
        System.out.println(s.trim());
        System.out.println(s.replace(" ",""));

        //split
        String test = "Hello_World_Test_Selenium";
        String[] split = test.split("_");
       for(String s1: split) System.out.println(s1);

       //Concat
        String s2 = "cares";
        System.out.println(s2.concat("s"));

        String x = "Hello";
        String y = "World";
        int a = 100;
        int b = 200;

        System.out.println(x+y);
        System.out.println(a+b);
        System.out.println(x+y+a+b);
        System.out.println(a+b+x+y);
        System.out.println(x+y+(a+b));
    }

}
