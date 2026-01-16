

public class StringDemo {
    public static void main(String[] args) {
        String s = "Hello";
        s = s.concat(" World");
        System.out.println(s);

        StringBuffer sb=new StringBuffer("hello");
        sb.append("hello");
        System.out.println(sb);

        StringBuilder sbb=new StringBuilder("hello");
        sbb.append("world");
        System.out.println(sbb);

        String sr = "123";
        int num = Integer.parseInt(sr);
        System.out.println(num + 10);
    }
}
