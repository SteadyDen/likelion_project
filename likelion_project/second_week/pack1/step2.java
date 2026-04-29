package second_week.pack1;

import java.util.Scanner;

public class step2 {
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
        Lion lion = new Lion(name, major, num);
        System.out.println("객체 생성이 완료되었습니다. 아기사자 객체의 상태를 확인합니다.");
        if (lion.isValid(name, major, num)) {
            System.out.println("아기사자 객체가 자신의 상태를 정상으로 판단했습니다.");
            System.out.println("아기사자 정보를 출력합니다.");
            lion.info();
            System.out.println();
        } else {
            System.out.println("잘못된 아기사자 정보입니다.");
        }
    }
}


