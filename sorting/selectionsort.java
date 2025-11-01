public class selectionsort {
    public static void main(String[] args) {
        
        int arr[]={7,8,1,3,2};
        int len=arr.length;

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
    }
}
