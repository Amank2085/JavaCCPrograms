package ProgramsCC;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FirstDigitOne {

    public static  int getFirstDigit(int num)
    {
        while (num>= 10)
        {
            num = num/10;
        }
        return num;
    }

    public static List<Integer> getNumberList(int arr[])
    {
        List<Integer> numbers = new ArrayList<>();
        for(int num: arr)
        {
            int n = getFirstDigit(num);
            if(n==1)
                numbers.add(num);
        }
        return numbers;
    }

    public static void main(String[] args) {
        int[] arr = {1, 23, 123, 45, 67, 167, 10, 11, 12, 901, 91, 19, 1111, 111};

        List<Integer> result = Arrays.stream(arr)
                .boxed()
                .filter(num -> String.valueOf(num).startsWith("1"))
                .collect(Collectors.toList());

        System.out.println(result);

        List<Integer> numberList = getNumberList(arr);
        System.out.println(numberList);
    }
}

