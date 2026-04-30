package second_week.pack1;

import java.util.Scanner;

public class step1 {
    static void main() {
        String name;
        String major;
        int num;

        Scanner sc = new Scanner(System.in);

        System.out.println("아기사자의 이름을 입력하세요.");
        name = sc.nextLine();
        System.out.println("아기사자의 전공을 입력하세요.");
        major = sc.nextLine();

        System.out.println("아기사자의 기수를 입력하세요.");
        while (true) {
            try {
                num = sc.nextInt();
                sc.nextLine();
                break;
            } catch (java.util.InputMismatchException e) {
                System.out.println("입력이 잘못되었습니다. 다시 입력해주세요.");
                sc.nextLine();
            }
        }
        if (name.isEmpty()) {
            System.out.println("이름은 비어있을 수 없습니다.");
            System.exit(0);
        } else if (major.isEmpty()) {
            System.out.println("전공은 비어있을 수 없습니다.");
            System.exit(0);
        } else if (num < 1) {
            System.out.println("기수는 1 이상이어야 합니다.");
            System.exit(0);
        } else {
            System.out.println("입력값 검증을 통과하여 아기사자 객체 생성을 진행합니다.");
            Lion lion = new Lion(name, major, num);
            System.out.println("아기사자 객체를 성공적으로 생성하였습니다.");
            System.out.println("아기사자 정보를 출력합니다.");
            System.out.printf("이름 : %s | 전공 : %s | 기수 : %d", name, major, num);
        }

    }
}