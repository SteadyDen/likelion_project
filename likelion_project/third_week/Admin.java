package third_week;

public class Admin extends Role implements interf{
    public String position;

    public Admin(String name, String major, String part, String year, String position) {
        super(name, major, part, year);
        this.position = position;
    }

    public boolean submit() {
        return false;
    }

    public boolean getPolicy() {
        return submit();
    }

    public String getInfo() {
        return "[운영진] " + getName() + " | [전공] " + getMajor() + " | [파트] " + getPart() + " | [기수] " + getYear() + " | [역할] " + position ;
    }
}
