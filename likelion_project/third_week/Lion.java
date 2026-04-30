package third_week;

public class Lion extends Role implements interf{

    public String student_num;

    public Lion(String name, String major, String part, String year, String student_num) {
        super(name, major, part, year);
        this.student_num = student_num;
    }

    public boolean submit() {
        return true;
    }

    public boolean getPolicy(){
        return submit();
    }

    public String getInfo() {
        return "[아기사자] " + getName() + " | [전공] " + getMajor() + " | [파트] " + getPart() + " | [기수] " + getYear() + " | [학번] " + student_num ;
    }
}
