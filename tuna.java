public class tuna {
    // day 2
    public void printMsg() {
        System.out.println("Hello Tuna!");
    }

    public void printInput(String name) {
        System.out.println("Hello " + name + "!");
    }

    private String girlName;
    public void setName(String name) {
        girlName = name;
    }
    public String getName() {
        return girlName;
    }
    public void saying() {
        System.out.printf("Your first gf was %s", getName());
    }

    // day 4
    private int hr;
    private int min;
    private int sec;
    private int pm = 0;

    public void setTime(int h, int m, int s) {
        hr = ((h>=0 && h<24) ? h : 0);
        if(hr == 12) {pm = 1;}
        else if(hr >= 13){
            hr -= 12;
            pm = 1;
        }
        min = ((m>=0 && m<60) ? m : 0);
        sec = ((s>=0 && s<60) ? s : 0);
    }

    public String printTime() {
        return String.format("%02d:%02d:%02d %s", hr, min, sec, ((pm == 1) ? "PM" : "AM"));
    }
}