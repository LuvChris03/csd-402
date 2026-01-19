import java.util.Arrays;

public class Average {

    public static short average(short[] array) {
        if (array == null || array.length == 0) return 0;
        int sum = 0;
        for (short val : array) {
            sum += val;
        }
        return (short) (sum / array.length);
    }

    public static int average(int[] array) {
        if (array == null || array.length == 0) return 0;
        long sum = 0;
        for (int val : array) {
            sum += val;
        }
        return (int) (sum / array.length);
    }

    public static long average(long[] array) {
        if (array == null || array.length == 0) return 0;
        double sum = 0; // Use double to prevent overflow during summation for this exercise
        for (long val : array) {
            sum += val;
        }
        return (long) (sum / array.length);
    }

    public static double average(double[] array) {
        if (array == null || array.length == 0) return 0;
        double sum = 0;
        for (double val : array) {
            sum += val;
        }
        return sum / array.length;
    }

    public static void main(String[] args) {
        System.out.println("--- Average Calculation Test Program ---\n");

        // Test 1: Short Array (Size 5)
        short[] shortArr = {10, 20, 30, 40, 50};
        System.out.println("Array type: short");
        System.out.println("Elements: " + Arrays.toString(shortArr));
        System.out.println("Size: " + shortArr.length);
        System.out.println("Calculated Average: " + average(shortArr));
        System.out.println("----------------------------------------");

        // Test 2: Int Array (Size 3)
        int[] intArr = {100, 205, 301};
        System.out.println("Array type: int");
        System.out.println("Elements: " + Arrays.toString(intArr));
        System.out.println("Size: " + intArr.length);
        System.out.println("Calculated Average: " + average(intArr));
        System.out.println("----------------------------------------");

        // Test 3: Long Array (Size 6)
        long[] longArr = {100000L, 200000L, 300000L, 400000L, 500000L, 600000L};
        System.out.println("Array type: long");
        System.out.println("Elements: " + Arrays.toString(longArr));
        System.out.println("Size: " + longArr.length);
        System.out.println("Calculated Average: " + average(longArr));
        System.out.println("----------------------------------------");

        // Test 4: Double Array (Size 4)
        double[] doubleArr = {10.5, 20.25, 30.75, 40.1};
        System.out.println("Array type: double");
        System.out.println("Elements: " + Arrays.toString(doubleArr));
        System.out.println("Size: " + doubleArr.length);
        System.out.println("Calculated Average: " + average(doubleArr));
        System.out.println("----------------------------------------");
    }
}