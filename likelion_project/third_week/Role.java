package third_week;

abstract class Role{
    private String name;
    private String major;
    private String part;
    private String year;

    public Role(String name, String major, String part, String year) {
        this.name = name;
        this.major = major;
        this.part = part;
        this.year = year;
    }

    public String getName() { return name; }
    public String getMajor() { return major; }
    public String getPart() { return part; }
    public String getYear() { return year; }

    abstract interf getPolicy();
    interf myPolicy = getPolicy();

    public void printCanSubmit() {
        if (myPolicy.submit()) {
            System.out.println("제출 가능합니다.");
        } else {
            System.out.println("제출 불가합니다.");
        }
    }

    public abstract String getInfo();
}
