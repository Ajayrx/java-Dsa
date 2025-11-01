public class test2 {
    public static void main(String[] args) {
        int[] arr = {7, 8, 1, 3, 2};
        int n = arr.length;

        // Selection Sort
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i; // assume current index is smallest

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j; // update smallest element index
                }
            }

            // Swap only if needed
            if (minIndex != i) {
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }

            // print array after each step
            System.out.print("Step " + (i + 1) + ": ");
            for (int k = 0; k < n; k++) {
                System.out.print(arr[k] + " ");
            }
            System.out.println();
        }

        // Final sorted array
        System.out.print("Sorted: ");
        for (int k = 0; k < n; k++) {
            System.out.print(arr[k] + " ");
        }
        System.out.println();
    }
}
