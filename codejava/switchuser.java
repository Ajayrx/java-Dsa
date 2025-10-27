public class switchuser {
    public static void main(String args[]) {
        int day =-1;

        switch(day) {
            case -1:
            System.out.println("Mon");
            break;

            case 2:
            System.out.println("Tue");
            break;

            case 3:
            System.out.println("wed - sunday");
            break;

            default:
            System.out.println("Invalid day");
        }
    }
    
}