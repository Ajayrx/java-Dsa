public class loops {
    public static void main(String args[]) {
        System.out.println("printing 1 to 10 // 10 to 1 using loop\n");

        // --------------- FOR LOOP --------------
        // for (int i =1 ; i<=10 ; i++ ){
        //     System.out.println(i);
        // }
        System.out.println("------ for loop ------");
        for (int i = 10 ; i>=1; i--) {
            System.out.println(i);
        }

        //------------ WHILE LOOP ----------
        System.out.println("------ while loop ------");
        int i=10;
        while(i>=1){
            System.out.println(i);
            i--;
        }

        //-------------DO WHILE LOOP------------
        System.out.println("------ do while loop ------");
        int j=10;
        do{
            System.out.println(j);
            j--;
        }while(j>=1);
    }  
}
