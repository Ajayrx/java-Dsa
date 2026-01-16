import javax.swing.*;
public class myframe {
    public static void main(String[] args) {
        JFrame f= new JFrame("Swing  Frame");
        JButton b= new JButton("Click me");
        b.setBounds(1,1,1,1);
        f.add(b);
        f.setSize(1920,1080);
        f.setVisible(true);
        
    }    
}
