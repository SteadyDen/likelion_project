package third_week;

public class Admin extends Role{
    public String position;

    class AdminPolicy implements interf {
        @Override
        public boolean submit() {
            return false; // 운영진은 제출 대상이 아니므로 false 반환
        }
    }
    public Admin(String name, String major, String part, String year, String position) {
        super(name, major, part, year);
        this.position = position;
    }

    public interf getPolicy() {
        return new AdminPolicy();
    }

    public String getInfo() {
        return "[운영진]" + getName() + " | [전공]" + getMajor() + " | [파트]" + getPart() + " | [기수]" + getYear() + " | [역할]" + position ;
    }
}
