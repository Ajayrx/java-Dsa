import java.util.*;
public class builtinsysoutput {
    public static void main(String args[]) {
        System.out.println("hello world pgp  ");
        double age =323.5;
        String name = "Ajay Bala";
        System.out.println("age is " + age);
        System.out.println(name.length()+"\n ------------- space -------------");
        String name1= " is Hero";
        String name3=name+name1;
        System.out.println(name3);
        System.out.println(name3.charAt(8));
        System.out.println(name3.length());
        String name4 = name3.replace("a","x");
        System.out.println(name4);
        System.out.println(name3.substring(5,9));

        int[] marks = {23, 45, 67, 89, 90};
        System.out.println(marks[1]);

        String[] students = { "ajay","bala"};
        System.out.println(students[0]);

        String[] names = new String[3];
        names[0]="b";
        names[1]="c";
        names[2]="a";

        System.out.println(names[1]);

        System.out.println(names.length);

        System.out.println(names[0]);
        Arrays.sort(names);
        System.out.println(names[0]);

        int[][] marks1 = {{12,14,15},{22,23,24}};
        System.out.println(marks1[0][2]);

        int p=100;
        //int fp=p+18;
        int fp=p+(int)60.18;
        System.out.println("Final Price is "+fp);

        double p1=100;
        double fp1=p1+0.18;
        System.out.println(fp1);


        int a = 20;
        a = 30;
        a= 40;

        System.out.println("Value of a is " + a);

        final int b = 20;
        //b=40;
        System.out.println("Value of b is " + b);

        int x= 1;
        int y=2;
        double div=(double)x/y;
        System.out.println("Division is " + div);
        double div1=x/y;
        System.out.println("Division is div " + div1);

        int f= 10;
        int g= 20;
        int sum = f+g;
        System.out.println("Sum is " + sum);

        int mul = f*g;
        System.out.println("Multiplication is " + mul);

        double div2 = (double)f/g;
        System.out.println("Division is " + div2);
        double div3 = f/g;
        System.out.println("Division is div3 " + div3);

        double f1=30;
        double g1=20;
        double mod = f1%g1;
        System.out.println("modulus is " + mod);

        int nn=1;
        //nn++;
        System.out.println(nn++);
        System.out.println(++nn);
        System.out.println(nn--);
        System.out.println(nn);

        System.out.println("---- maths operations ----");
        System.out.println(Math.max(2,9));
        System.out.println(Math.min(2,9));
        System.out.println(Math.abs(-9));
        System.out.println(Math.sqrt(9));
        System.out.println(Math.pow(2,3));
        System.out.println(Math.random());
        System.out.println(Math.random()*100);
        System.out.println(Math.round(9.8));
        System.out.println(Math.ceil(9.1));
        System.out.println(Math.floor(9.9));
        System.out.println(Math.PI);
        System.out.println(Math.E);
        System.out.println(Math.log(10));
        System.out.println(Math.log10(100));
        System.out.println("Trigonometric functions:");
        System.out.println(Math.sin(30));
        System.out.println(Math.sin(Math.toDegrees(30)));
        System.out.println(Math.cos(0));
        System.out.println(Math.tan(0));
        System.out.println(Math.asin(0));
            
        System.out.println(Math.acos(0));
        System.out.println(Math.atan(0));
        System.out.println(Math.toDegrees(0));
        System.out.println(Math.toRadians(0));
        System.out.println(Math.hypot(3, 4));


        System.out.println("Math operations completed");


        System.out.println((int)(Math.random()*100));


    }
    
}
