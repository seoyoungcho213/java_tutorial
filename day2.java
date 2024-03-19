import java.util.Scanner;
import java.util.Random;

// 1 : Multiple Classes
class salmon {
    public static void main(String[] args) {
        tuna tunaObj = new tuna();
        tunaObj.printMsg();
    }
}

// 2 : Methods with Parameters
class apple {
    public static void main(String[] args) {
        tuna tunaObj = new tuna();

        Scanner bucky = new Scanner(System.in);
        System.out.print("Enter your name here: ");
        String name = bucky.nextLine();

        tunaObj.printInput(name);
    }
}

// 3 : Methods and Instances
class baby {
    public static void main(String[] args) {
        tuna tunaObj = new tuna();

        Scanner bucky = new Scanner(System.in);
        System.out.print("Enter your first girl friend name here: ");
        String name = bucky.nextLine();

        tunaObj.setName(name);
        tunaObj.saying();
    }
}

// 4 : Random
class coin {
    public static void main(String[] args) {
        Random dice = new Random();
        int num;

        for(int i = 1; i < 10; i++) {
            // without "+ 1", [0,5]
            num = 1 + dice.nextInt(6);
            System.out.println(num);
        }
    }
}

/*
 * day 2
 * watched up to tutorial 27
 * 
 * <What I've learned>
 * Can't use same class name even though you are in a different file.
 * Whenever you are using public class, you need its own file with its own class name.
 * 
 * Type String uses capital 'S'.
 * 
 * .nextInt(num) : number sets a bound
 */