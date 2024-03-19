public class tuna {
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
}