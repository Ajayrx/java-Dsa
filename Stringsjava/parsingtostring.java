public class parsingtostring {
    public static void main(String[] args) {
        

        // parseInt
        String str="123";
        int number=Integer.parseInt(str);
        System.out.println(number+1000);


        // toString
        int number1=123;
        String str1=Integer.toString(number1);
        System.out.println(str1);
        System.out.println(str+" nice");
        System.out.println(str1.length());
    }
}
