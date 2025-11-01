import java.util.Scanner;

public class testsorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the arr size: ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("for " + i + " position: ");
            arr[i] = sc.nextInt();
        }
        int len = arr.length;

        System.out.print("Enter 1 for Buuble || 2 for Selection || 3 for Insertion sorting: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:

                for (int i = 0; i < len-1; i++) {
                    boolean swapped = false;

                    for (int j = 0; j < len - i - 1; j++) {
                        if (arr[j] > arr[j + 1]) {
                            int temp = arr[j];
                            arr[j] = arr[j + 1];
                            arr[j + 1] = temp;
                            swapped = true;
                        }
                    }
                    System.out.print("step " + (i + 1) + " : ");
                    for (int j : arr) {
                        System.out.print(j + " ");
                    }
                    System.out.println();
                    if (!swapped)
                        break;
                }

                // print array
                System.out.print("Bubble sorted array :  ");
                for (int i = 0; i < len; i++) {
                    System.out.print(+arr[i] + " ");
                }
                break;

            case 2:
                for (int i = 0; i < len - 1; i++) {
                    int small = i;
                    for (int j = i + 1; j < len; j++) {
                        if (arr[j] < arr[small]) {
                            small = j;
                        }
                    }
                    if (small != i) {
                        int temp = arr[small];
                        arr[small] = arr[i];
                        arr[i] = temp;
                    }
                    System.out.print("Step " + (i + 1) + ": ");
                    for (int j : arr) {
                        System.out.print(j + " ");
                    }
                    System.out.println();

                }
                System.out.print("selection sorted array : ");
                for (int i : arr) {
                    System.out.print(i + " ");
                }
                break;

            case 3:
                for (int i = 1; i < len; i++) {
                    int current = arr[i];
                    int j = i - 1;
                    while (j >= 0 && current < arr[j]) {
                        arr[j + 1] = arr[j];
                        j--;
                    }

                    if (j + 1 != i) {
                        arr[j + 1] = current;
                    }

                    System.out.print("steps: ");
                    for (int k : arr) {
                        System.out.print(k + " ");
                    }
                    System.out.println();
                }
                System.out.print("Insertion sorted array: ");
                for (int i : arr) {
                    System.out.print(i + " ");
                }
                break;

            default:
                System.out.println("Invalid input use 1 or 2 or 3 ");
                break;
        }

        sc.close();

    }

}

// function implement ......

// public static void bubbleSort(int[] arr) { ... }
// public static void selectionSort(int[] arr) { ... }
// public static void insertionSort(int[] arr) { ... }
// Then your switch becomes:

// switch (choice) {
//     case 1 -> bubbleSort(arr);
//     case 2 -> selectionSort(arr);
//     case 3 -> insertionSort(arr);
//     default -> System.out.println("Invalid input, use 1 or 2 or 3");

// public static void main(String[] args) {
// Scanner sc=new Scanner(System.in);
// int bullbesort[]={7,8,3,1,2};

// for (int i=0;i<bullbesort.length;i++){
// //
// boolean swapped=false;

// for (int j=0;j<bullbesort.length-i-1;j++){
// if (bullbesort[j]>bullbesort[j+1]){
// // swap
// int temp=bullbesort[j];
// bullbesort[j]=bullbesort[j+1];
// bullbesort[j+1]=temp;
// swapped=true;
// }
// }
// if (!swapped) break;{
// //System.out.println("Not swaped");
// }
// }
// for (int i=0;i<bullbesort.length;i++){
// // for (int i:bullbesort){
// // System.out.print(i+" ");
// // }
// System.out.print(bullbesort[i] + " ");
// }
// System.out.println();

// sc.close();
// }
