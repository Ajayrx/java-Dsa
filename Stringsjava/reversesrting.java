public class reversesrting {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");

        for (int i=0;i<sb.length()/2;i++){
            // int front=i;
            // int back=sb.length()-1-i;

            char frontchar=sb.charAt(i);
            char backchar=sb.charAt(sb.length()-1-i);

            sb.setCharAt(i, backchar);
            sb.setCharAt(sb.length()-1-i,frontchar);

            // char frontchar=sb.charAt(front);
            // char backchar=sb.charAt(back);

            // sb.setCharAt(front,backchar);
            // sb.setCharAt(back,frontchar);


        }
        System.out.println(sb);
    }
}
