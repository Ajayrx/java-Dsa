import java.util.Scanner;

public class test {
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

        System.out.print("Enter 1 for buuble sorting || 2 for selection sorting: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                

                for (int i = 0; i < len; i++) {
                    boolean swapped = false;

                    for (int j = 0; j < len - i - 1; j++) {
                        if (arr[j] > arr[j + 1]) {
                            int temp = arr[j];
                            arr[j] = arr[j + 1];
                            arr[j + 1] = temp;
                            swapped = true;
                        }
                    }
                    if (!swapped)
                        break;
                }

                // print array

                for (int i = 0; i < len; i++) {
                    System.out.print(arr[i] + " ");
                }
                break;

            case 2:
                for (int i=0;i<len-1;i++){
                    int small=i;
                    for (int j=i+1;j<len;j++){
                        if (arr[j]<arr[small]){
                            small=j;
                        }
                    }
                    int temp=arr[small];
                    arr[small]=arr[i];
                    arr[i]=temp;
                }

                for (int i:arr){
                    System.out.print(i+" ");
                }
                break;

            default:
                System.out.println("invalid input use 1 or 2");
                break;
        }

        sc.close();

    }

}

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
