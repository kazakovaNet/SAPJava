package java1_foreach_Exercise_2;

import java.util.ArrayList;

public class Calculator {
    public int[][] ledMatrix;
    int calculateSum(int[] numbers) {
        // sum up the values of all elements in numbers here and return the sum.
        int sum = 0;

        for (int num :
                numbers) {
            sum += num;
        }


        return sum;
    }

    double calculateMean(int[] numbers) {
        double sum = calculateSum(numbers);
        //calculate the arithmetic mean here and return it.
        return sum / numbers.length;

    }
}
