public class ArrayOperations {

    public static void main(String[] args) {

        // -------------------- 1D Array --------------------
        int[] numbers = {25, 10, 45, 30, 5};

        int sum = 0;
        int max = numbers[0];
        int min = numbers[0];

        // -------------------- Sum, Max, Min --------------------
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];

            if (numbers[i] > max) {
                max = numbers[i];
            }

            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        double average = (double) sum / numbers.length;

        // -------------------- Manual Sorting (Bubble Sort) --------------------
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        // -------------------- Display Results --------------------
        System.out.println("---- Array Operations ----");
        System.out.print("Sorted Array : ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        System.out.println("\nSum           : " + sum);
        System.out.println("Average       : " + average);
        System.out.println("Maximum       : " + max);
        System.out.println("Minimum       : " + min);

        // -------------------- 2D Array --------------------
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };

        System.out.println("\n---- 2D Array Elements ----");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // -------------------- Exception Handling --------------------
        try {
            System.out.println(numbers[10]); // Invalid index
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("\nException Caught: Array index out of bounds!");
        }
    }
}
