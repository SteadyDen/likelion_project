package third_week;

public class Alumni extends Role{
    public String currentJob;

    public Alumni(String name, String major, String part, String year, String currentJob) {
        super(name, major, part, year);
        this.currentJob = currentJob;
    }

    public boolean submit123() {
        int a = Integer.parseInt(getYear());
        if (a >= 14) {
            return true;
        } else {
            return false;
        }
    }

    public boolean getPolicy() {
        return submit123();
    }

    public String getInfo() {
        return "[알럼나이] " + getName() + " | [전공] " + getMajor() + " | [파트] " + getPart() + " | [기수] " + getYear() + " | [현재 직무] " + currentJob;
    }
}
