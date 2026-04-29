package second_week.pack1;

public class Lion {
    //멤버 변수
    public String name;
    String major;
    private final int num;

    public Lion(String name, String major, int num) {
        this.name = name;
        this.major = major;
        this.num = num;
    }

    public static boolean isValid(String name, String major, int num) {
        if (name.isEmpty()) {
            System.out.println("이름은 비어있을 수 없습니다.");
            return false;
        } else if (major.isEmpty()) {
            System.out.println("전공은 비어있을 수 없습니다.");
            return false;
        } else if (num < 1) {
            System.out.println("기수는 1 이상이어야 합니다.");
            return false;
        } else {
            return true;
        }
    }

    public void info() {
        System.out.printf("이름 : %s | 전공 : %s | 기수 : %d\n", this.name, this.major, this.num);
    }
}
