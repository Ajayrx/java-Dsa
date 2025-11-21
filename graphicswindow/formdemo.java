import java.awt.*;
import java.awt.event.*;

public class formdemo {
    public static void main(String[] args) {
        Frame frame=new Frame("form Demo");
        Panel panel=new Panel(new FlowLayout());

        Label nameLabel = new Label("Name :");
        //Label newLabel=new Label("Name:");                 // error newlabel to namelabel
        TextField nameField=new TextField(20);
        Label genderLabel=new Label("Gender");
        Choice genderChoice=new Choice();
        genderChoice.add("Male");
        genderChoice.add("feMale");
        genderChoice.add("other");

        Checkbox subscribe=new Checkbox("suscribe to updates",true);
        Button submit=new Button("submit");

        
        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(genderLabel);
        panel.add(genderChoice);
        panel.add(subscribe);
        panel.add(submit);

        frame.add(panel);
        frame.pack();

        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                frame.dispose();
            }
        });
    }
}
