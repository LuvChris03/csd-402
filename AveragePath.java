import java.util.Arrays;

public class AveragePath {

    // Overloaded methods with step-by-step print
    public static short average(short[] array) {
        if (array == null || array.length == 0) return 0;
        int sum = 0;
        System.out.print("   Summing elements: ");
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            System.out.print(array[i]);
            if (i < array.length - 1) System.out.print(" + ");
        }
        System.out.println(" = " + sum);
        short avg = (short) (sum / array.length);
        System.out.println("   Dividing by number of elements (" + array.length + "): " + sum + "/" + array.length + " = " + avg);
        return avg;
    }

    public static int average(int[] array) {
        if (array == null || array.length == 0) return 0;
        long sum = 0;
        System.out.print("   Summing elements: ");
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            System.out.print(array[i]);
            if (i < array.length - 1) System.out.print(" + ");
        }
        System.out.println(" = " + sum);
        int avg = (int) (sum / array.length);
        System.out.println("   Dividing by number of elements (" + array.length + "): " + sum + "/" + array.length + " = " + avg);
        return avg;
    }

    public static long average(long[] array) {
        if (array == null || array.length == 0) return 0;
        long sum = 0;
        System.out.print("   Summing elements: ");
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            System.out.print(array[i]);
            if (i < array.length - 1) System.out.print(" + ");
        }
        System.out.println(" = " + sum);
        long avg = sum / array.length;
        System.out.println("   Dividing by number of elements (" + array.length + "): " + sum + "/" + array.length + " = " + avg);
        return avg;
    }

    public static double average(double[] array) {
        if (array == null || array.length == 0) return 0;
        double sum = 0;
        System.out.print("   Summing elements: ");
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            System.out.print(array[i]);
            if (i < array.length - 1) System.out.print(" + ");
        }
        System.out.println(" = " + sum);
        double avg = sum / array.length;
        System.out.println("   Dividing by number of elements (" + array.length + "): " + sum + "/" + array.length + " = " + avg);
        return avg;
    }

    public static void main(String[] args) {
        System.out.println("--- Average Calculation Path Program ---\n");

        // Short array
        short[] shortArr = {10, 20, 30, 40, 50};
        System.out.println("Array type: short");
        System.out.println("Elements: " + Arrays.toString(shortArr));
        System.out.println("Size: " + shortArr.length);
        System.out.println("Calculating Average:");
        short avgShort = average(shortArr);
        System.out.println("Result: " + avgShort);
        System.out.println("----------------------------------------");

        // Int array
        int[] intArr = {100, 205, 301};
        System.out.println("Array type: int");
        System.out.println("Elements: " + Arrays.toString(intArr));
        System.out.println("Size: " + intArr.length);
        System.out.println("Calculating Average:");
        int avgInt = average(intArr);
        System.out.println("Result: " + avgInt);
        System.out.println("----------------------------------------");

        // Long array
        long[] longArr = {100000L, 200000L, 300000L, 400000L, 500000L, 600000L};
        System.out.println("Array type: long");
        System.out.println("Elements: " + Arrays.toString(longArr));
        System.out.println("Size: " + longArr.length);
        System.out.println("Calculating Average:");
        long avgLong = average(longArr);
        System.out.println("Result: " + avgLong);
        System.out.println("----------------------------------------");

        // Double array
        double[] doubleArr = {10.5, 20.25, 30.75, 40.1};
        System.out.println("Array type: double");
        System.out.println("Elements: " + Arrays.toString(doubleArr));
        System.out.println("Size: " + doubleArr.length);
        System.out.println("Calculating Average:");
        double avgDouble = average(doubleArr);
        System.out.println("Result: " + avgDouble);
        System.out.println("----------------------------------------");

        System.out.println(">>> All averages calculated. <<<");
    }
}
