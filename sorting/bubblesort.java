public class bubblesort {
    public static void main(String[] args) {
        int arr[] = { 7, 8, 3, 1, 2 };

        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped=false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped=true;
                }
            }
            if (!swapped) break;
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

    }
}
