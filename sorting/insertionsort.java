public class insertionsort {
    public static void main(String[] args) {
        int arr[] = { 7, 8, 1, 3, 2 };

        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && current < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            if (j + 1 != i) {
                arr[j + 1] = current;
            }

            System.out.print("step ");
            for (int k : arr) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
        System.out.print("insertion sorted array : ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
