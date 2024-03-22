import java.awt.FlowLayout;
//waits user to press smth or enter smth
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

//"extends JFrame" enable us to create a window
public class tutorial_52 extends JFrame{
    private JTextField item1;
    private JTextField item2;
    private JTextField item3;
    private JPasswordField pwField;

    public tutorial_52() {
        super("Title");
        setLayout(new FlowLayout());

        item1 = new JTextField(10);
        add(item1);

        item2 = new JTextField("Enter text here");
        add(item2);

        item3 = new JTextField("uneditable", 20);
        item3.setEditable(false);
        add(item3);

        pwField = new JPasswordField("password");
        add(pwField);

        thehandler handler = new thehandler();
        item1.addActionListener(handler);
        item2.addActionListener(handler);
        item3.addActionListener(handler);
        pwField.addActionListener(handler);
    }

    //this is the handler to handle actions/events
    private class thehandler implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            String string = "";

            //if item1 is hit
            if(event.getSource() == item1) {
                string = String.format("field 1: %s", event.getActionCommand());
            }
            else if(event.getSource() == item2) {
                string = String.format("field 2: %s", event.getActionCommand());
            }
            else if(event.getSource() == item3) {
                string = String.format("field 3: %s", event.getActionCommand());
            }
            else if(event.getSource() == pwField) {
                string = String.format("password field is : %s", event.getActionCommand());
            }

            JOptionPane.showMessageDialog(null, string);
        }
    }
}
