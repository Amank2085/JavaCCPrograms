package ProgramsCC;

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
    }

}
