import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

//JFrame gives all basic Window features
public class gui_sofun extends JFrame{
    private JLabel item1;
    
    public gui_sofun() {
        super("The title bar");
        setLayout(new FlowLayout());

        item1 = new JLabel("this is a sentence");
        item1.setToolTipText("This is gonna show up on hover");
        add(item1);
    }
}
