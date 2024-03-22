public class names {
    private String first;
    private String last;
    //static -> shared among all names
    private static int members = 0;

    public names(String fn, String ln) {
        first = fn;
        last = ln;
        members++;
        System.out.printf("Contrusctor for %s %s, members num = %d\n", fn, ln, members);
    }

    public String getFirst() {return first;}
    public String getLast() {return last;}
    public static int getMem() {return members;}
}
