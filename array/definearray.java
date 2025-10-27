public class definearray {
    public static void main(String[] args) {

        // int[] marks = new int[5];
        // marks[0]=94;
        // marks[1]=97;
        // marks[2]=78;
        // marks[3]=98;
        // marks[4]=100;

        int marks[]={94,97,78,98,100};

        // String[] subject = new String[5];
        // subject[0]="Math";
        // subject[1]="chem";
        // subject[2]="phy";
        // subject[3]="bio";
        // subject[4]="eng";

        String subject[] = {"Math","Chem","Phy","Bio","Eng"};

        for (int i=0;i<marks.length;i++){
            System.out.println("Mark in " +subject[i]+ " = "+marks[i]);
        }
        
    }
    
}
