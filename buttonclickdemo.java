import javax.swing.*;
import java.awt.event.*;

public class buttonclickdemo {
    public static void main(String[] args) {
        JFrame f=new JFrame("Button click Demo");
        JButton b=new JButton("Click Me");
        b.setBounds(50,50,50,50);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("button clicked");
            }
        });
        f.setSize(600,600);
        f.add(b);
        f.setLayout(null);
        f.setVisible(true);
    }
}
