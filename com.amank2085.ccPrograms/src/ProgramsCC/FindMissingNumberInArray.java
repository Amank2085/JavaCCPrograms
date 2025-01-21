package ProgramsCC;

import java.util.Arrays;

public class FindMissingNumberInArray {

    //Using Gauss' Formula
    public void FindMissingNumberUsingGauss(int[] arr) {

        int n = arr[arr.length - 1]; // total number of elements including the missing one
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : arr) {
            actualSum += num;
        }

        int missingNum = expectedSum - actualSum;
        System.out.println(missingNum);

    }

    //Using Sorting
    public void FindMissingNumberUsingSort(int[] arr) {

        Arrays.sort(arr);

        int missingNum = -1;
        for (int i = 1; i <= arr.length; i++) {
            if (i != arr[i - 1]) {
                missingNum = i;
                break;
            }
        }

        if (missingNum == -1) {
            missingNum = arr.length + 1;
        }

        System.out.println(missingNum);
    }


    //bruteForce
    public void bruteForce(int a[]) {
        //1+2+4+5 = 12
        //1+2+3+4+5 = 15
        //15 - 12 = 3

        int sum = 0;
        for (int i : a) {
            sum = sum + i;
        }

        int latNum = a[a.length - 1];
        int sum1 = 0;
        for (int i = 0; i <= latNum; i++) {
            sum1 = sum1 + i;
        }

        int missingNum = sum1 - sum;
        System.out.println(missingNum);
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 4, 5};
        FindMissingNumberInArray find = new FindMissingNumberInArray();
        find.bruteForce(a);
        find.FindMissingNumberUsingSort(a);
        find.FindMissingNumberUsingGauss(a);

    }
}
