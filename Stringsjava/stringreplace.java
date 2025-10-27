import java.util.Scanner;

public class stringreplace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // original = “eabcdef’ ; result = “iabcdif”
        // original = “xyz” ; result = “xyz”
        System.out.print("Enter your String : ");
        String name = sc.nextLine();

        // String result="";
        StringBuilder result=new StringBuilder();

        for (int i=0;i<name.length();i++){
            if (name.charAt(i)=='e'){
                result.append('i');
            }else{
                 result.append(name.charAt(i));
            }
        }

        // StringBuilder result=new StringBuilder(name);

        // for (int i=0;i<name.length();i++){
        //     if (result.charAt(i)=='e'){
        //         result.setCharAt(i,'i');
        //     // }else{
        //     //     result.append(name.charAt(i));
        //     // }
        //     }
        // }

        System.out.println("your answer : "+result);



        sc.close();
    }
}
