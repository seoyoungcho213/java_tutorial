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
    }
}

/*
 * day 3
 * watched up to tutorial 27
 * 
 * <What I've learned>
 * Array initialization
 * '\t' = tap
 */