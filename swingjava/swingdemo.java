
import javax.swing.*;
public class swingdemo {
    public static void main(String[] args) {
        
        JFrame f=new JFrame("swing example");
        JButton b=new JButton("click me");

        b.setBounds(200,50,500,30);
        f.add(b);

        f.setSize(1920,1080);
        f.setLayout(null);
        f.setVisible(true);

    }
}
