package third_week;

public class Lion extends Role{

    public String student_num;

    class LionPolicy implements interf {
        @Override
        public boolean submit() {
            return true; // 아기사자는 제출 가능하므로 true 반환
        }
    }

    public Lion(String name, String major, String part, String year, String student_num) {
        super(name, major, part, year);
        this.student_num = student_num;
    }

    public interf getPolicy() {
        return new LionPolicy();
    }

    public String getInfo() {
        return "[아기사자]" + getName() + " | [전공]" + getMajor() + " | [파트]" + getPart() + " | [기수]" + getYear() + " | [학번]" + student_num ;
    }
}
