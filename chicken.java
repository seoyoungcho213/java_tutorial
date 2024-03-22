// day 5
public enum chicken {
    amy("SWE", "22"),
    andy("google", "24"),
    emma("meta", "27");

    //final = value cannot be changed after init
    private final String DESC;
    private final String AGE;

    chicken(String description, String year) {
        DESC = description;
        AGE = year;
    }

    public String getDesc() {
        return DESC;
    }

    public String getAge() {
        return AGE;
    }
}
