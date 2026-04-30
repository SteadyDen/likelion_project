package third_week;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== 아기사자 정보를 입력하세요 ===");
        System.out.print("이름: "); String lName = sc.next();
        System.out.print("전공: "); String lMajor = sc.next();
        System.out.print("기수(숫자): "); String lOrdinal = sc.next();
        System.out.print("파트: "); String lPart = sc.next();
        System.out.print("학번: "); String lId = sc.next();

        Role lion = new Lion(lName, lMajor, lOrdinal, lPart, lId);

        System.out.println("\n=== 운영진 정보를 입력하세요 ===");
        System.out.print("이름: "); String sName = sc.next();
        System.out.print("전공: "); String sMajor = sc.next();
        System.out.print("기수(숫자): "); String sOrdinal = sc.next();
        System.out.print("파트: "); String sPart = sc.next();
        System.out.print("직책: "); String sRole = sc.next();

        Role admin = new Admin(sName, sMajor, sOrdinal, sPart, sRole);

        System.out.println("\n=== 알럼나이 정보를 입력하세요 ===");
        System.out.print("이름: "); String aName = sc.next();
        System.out.print("전공: "); String aMajor = sc.next();
        System.out.print("기수(숫자): "); String aOrdinal = sc.next();
        System.out.print("파트: "); String aPart = sc.next();
        System.out.print("현재 직무: "); String aCurrentJob = sc.next();

        Role Alumni= new Alumni(aName, aMajor, aPart, aOrdinal, aCurrentJob);

        System.out.println("\n==============================");
        System.out.println("입력된 정보 및 과제 제출 여부 확인");
        System.out.println("==============================");

        System.out.println(lion.getInfo());
        lion.printCanSubmit();
        System.out.println();
        System.out.println(admin.getInfo());
        admin.printCanSubmit();
        System.out.println();
        System.out.println(Alumni.getInfo());
        Alumni.printCanSubmit();
    }
}