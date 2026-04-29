package second_week.pack2;
import second_week.pack1.Lion;

public class step3 {
    static void main() {
        String name = "김동해";
        String major = "정보기슬학부";
        int num = 14;

        Lion lion = new Lion(name, major, num);
        System.out.println("Step 3-1. public 필드 접근을 시도합니다.");
        System.out.println("name 필드 값을 변경합니다.");
        lion.name = "홍길동";
        System.out.println("public 필드 접근 성공");
        System.out.println("아기사자 정보를 출력합니다.");
        lion.info();
    }
}
