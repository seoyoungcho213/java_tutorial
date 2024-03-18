import java.util.Scanner;

// 1 : Print String
class apples{
    public static void main (String args[]){
        System.out.println("Hello World!");
    }
}

// 2 : Print Variables, print vs. println
class banana{
    public static void main (String args[]){
        double tuna = 5.28;

        System.out.print("I want ");
        System.out.print(tuna);
        System.out.println(" tuna");
        System.out.print("yay new line");
    }
}

// 3 : Getting User Input
class cat{
    public static void main(String[] args) {
        Scanner bucky = new Scanner(System.in);
        System.out.println(bucky.nextLine());
    }
}

// 4 : calculator
class dog{
    public static void main(String[] args) {
        Scanner bucky = new Scanner(System.in);
        int num1, num2, ans;
        System.out.print("Enter first number: ");
        num1 = bucky.nextInt();
        System.out.print("Enter second number: ");
        num2 = bucky.nextInt();
        ans = num1 + num2;
        System.out.println("Answer is " + ans);
    }
}

/*
 * day 1
 * Set up environment for Java
 * watched up to tutorial 13
 * <What I've learned>
 * operations, loop, switch are same with C. 
 * 
 * Everything in Java needs to be in class.
 * 
 * print -> no '\n', 
 * println -> '\n' after that line.
 * During print, can combine with '+'
 * 
 * .nextLine waits til user responds -> needs it first
 * .nextDouble, .nextInt -> save string into specific data type
 */