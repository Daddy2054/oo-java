package polymorphism;

import java.util.Arrays;

//add class definitions below this line
class Median {
    public double calculateMedian(int a, int b) {
        return (double) (a + b) / 2;
    }

    public double calculateMedian(int a, int b, int c) {
        int[] arr = { a, b, c };
        Arrays.sort(arr);
        return (double) arr[1];
    }

    public double calculateMedian(int a, int b, int c, int d) {
        int[] arr = { a, b, c, d };
        Arrays.sort(arr);
        return (double) (arr[1] + arr[2]) / 2;
    }

    public double calculateMedian(int a, int b, int c, int d, int e) {
        int[] arr = { a, b, c, d, e };
        Arrays.sort(arr);
        return (double) arr[2];
    }
}

// add class definitions above this line

public class Exercise4 {
    public static void main(String[] args) {

        // add code below this line
        Median m = new Median();
        System.out.println(m.calculateMedian(3, 5, 1, 4, 2));// 3.0
        System.out.println(m.calculateMedian(8, 6, 4, 2));// 5.0
        System.out.println(m.calculateMedian(9, 3, 7));// 7.0
        System.out.println(m.calculateMedian(5, 2)); // 3.5

        // add code above this line
    }
}
