public class ArrayLocator {

    // Method to locate the largest element in a double 2D array
    public static int[] locateLargest(double[][] arrayParam) {
        int[] location = {0, 0}; // store row and column of largest element
        double max = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > max) {
                    max = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    // Method to locate the largest element in an int 2D array
    public static int[] locateLargest(int[][] arrayParam) {
        int[] location = {0, 0};
        int max = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > max) {
                    max = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    // Method to locate the smallest element in a double 2D array
    public static int[] locateSmallest(double[][] arrayParam) {
        int[] location = {0, 0};
        double min = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < min) {
                    min = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    // Method to locate the smallest element in an int 2D array
    public static int[] locateSmallest(int[][] arrayParam) {
        int[] location = {0, 0};
        int min = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < min) {
                    min = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    // Optional: main method to test
    public static void main(String[] args) {
        double[][] array = {
            {3.5, 2.1, 4.7},
            {1.2, 5.8, 0.3},
            {7.4, 3.3, 2.2}
        };

        int[] largest = locateLargest(array);
        int[] smallest = locateSmallest(array);

        System.out.println("Largest element at: (" + largest[0] + ", " + largest[1] + ")");
        System.out.println("Smallest element at: (" + smallest[0] + ", " + smallest[1] + ")");
    }
}
