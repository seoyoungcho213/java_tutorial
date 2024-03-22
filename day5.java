import java.util.EnumSet;
import javax.swing.JOptionPane;
import javax.swing.JFrame;

// 1 : public enum (chicken.java)
class phone {
    public static void main(String[] args) {
        for(chicken people: chicken.values())
            System.out.printf("%s\t%s\t%s\n", people, people.getDesc(), people.getAge());
        
// 2 : EnumSet
        System.out.println("\nRange of constants");
        for(chicken people: EnumSet.range(chicken.amy, chicken.andy))
        System.out.printf("%s\t%s\t%s\n", people, people.getDesc(), people.getAge());
    }
}

// 3 : Static
class meg {
    public static void main(String[] args) {
        names mem1 = new names("Megan", "Fox");
        names mem2 = new names("Natalie", "Portman");
        names mem3 = new names("Taylor", "Swift");

        System.out.println();
        System.out.println(mem1.getFirst());
        System.out.println(mem1.getLast());
        //for static, you can put class name instead of obj name
        System.out.println(names.getMem());
    }
}

// 4 : Inheritance [49]
// public class tuna "extends food"
// tuna inherited everything in food
// also can overwrite with same name

// 5 : GUI - graphical user interface
class guii {
    public static void main(String[] args) {
        String firstNum = JOptionPane.showInputDialog("Enter first number");
        String secondNum = JOptionPane.showInputDialog("Enter second number");

        //convert string to int
        int num1 = Integer.parseInt(firstNum);
        int num2 = Integer.parseInt(secondNum);
        int sum = num1 + num2;

        JOptionPane.showMessageDialog(null, "The answer is " + sum, "the title", JOptionPane.PLAIN_MESSAGE);
    }
}

class anotherGUI {
    public static void main(String[] args) {
        gui_sofun first = new gui_sofun();
        //whenever we hit 'X' button, program terminates.
        first.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        first.setSize(275,180);
        first.setVisible(true);
    }
}

class program {
    public static void main(String[] args) {
        tutorial_52 window = new tutorial_52();

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(350,100);
        window.setVisible(true);
    }
}

/*
 * day 5
 * watched up to tutorial 54
 * 
 * <What I've learned>
 * [44]
 * 'private final'
 * -> final = value cannot be changed after init
 * 
 * A lot of GUI stuff
 * 
 * <What Files Were Used>
 * day5.java, chicken.java, names.java, gui_sofun.java, tutorial_52.java
 */