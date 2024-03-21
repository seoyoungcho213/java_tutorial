import java.util.Random;

// 1 : Array
class array {
    public static void main(String[] args) {
        int temp[] = new int[10];
        temp[0] = 0;
        temp[1] = 1;
        temp[9] = 99;

        //or
        int another[] = {2,3,4,5,6};
        System.out.println(another[2]);

        System.out.println("length of array = " + another.length);
    }
}

// 2 : Array Elem as Counters
class counter {
    public static void main(String[] args) {
        Random rand = new Random();
        int freq[] = new int[7];
        
        for(int roll = 1; roll < 1000; roll++) {
            ++freq[1+rand.nextInt(6)];
        }

        System.out.println("Number\tFrequency");
        for (int i = 1; i < freq.length; i++) {
            System.out.println(i + "\t" + freq[i]);
        }
    }
}

// 3 : Array Elem as Counters 2
class bucky {
    public static void main(String[] args) {
        int temp[] = {3,4,5,6,7};
        int total = 0;

        //this x go through temp values
        for(int x: temp) {
            total += x;
        }

        System.out.println(total);
    }
}

// 4 : Multidimensional Array
class two_dimensional {
    public static void main(String[] args) {
        int first[][] = {{1,2,3,4},{5,6,7,8}};
        int second[][] = {{1,2,3,4},{6},{1,2,3}};
    }
}

// 5 : for loop
class avg {
    public static void main(String[] args) {
        System.out.println(average(1,2,3,4,5,6,7));
    }

    // '...' means don't know how many ints are there
    public static int average(int...nums) {
        int total = 0;
        for(int x:nums) {total += x;}
        return total/nums.length;
    }
}


/*
 * day 3
 * watched up to tutorial 35
 * 
 * <What I've learned>
 * Array initialization
 * '\t' = tap
 * 
 * for('int x: temp')
 * -> x go through vars in temp
 * 
 * how to make multidimensional array
 * 
 * '...' means don't know how many variables are there
 * -> no need to know size of array
 */