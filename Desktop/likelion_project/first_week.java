import java.util.Scanner;

public class first_week {
    public static void main(String[] args) {
        String exitOrRestart = "restart";
        int memberAmount = 0;
        String[] memberNameArray = {};
        Scanner sc = new Scanner(System.in, "UTF-8");
        while (exitOrRestart == "restart") {
            try {
            do {
            System.out.println("아기사자 수를 입력해주세요. ");
            memberAmount = sc.nextInt();
            if (memberAmount<5) {
                System.out.println("[오류] 5 이상 입력해주세요.");
            }
        } while (memberAmount<5); 
                } catch (java.util.InputMismatchException e) {
                    System.out.println("[오류] 숫자만 입력 할 수 있습니다.");
                    sc.nextLine();
                    continue;
                }

            memberNameArray = new String[memberAmount];
            sc.nextLine(); //버퍼 청소

            System.out.println("아기사자의 이름을 입력해주세요.");
            for (int i = 0; i < memberAmount; i++) {
                memberNameArray[i] = sc.nextLine();
                if (memberNameArray[i] == "") {
                    System.out.println("이름이 비어있습니다. 다시 입력해주세요.");
                    memberNameArray[i] = sc.nextLine();     
                }
                if (i>=1) {
                    for (int j = 0; j < memberAmount; j++) {
                        if (memberNameArray[i] == memberNameArray[j]) {
                            System.out.println("이미 등록된 이름입니다. 다시 입력해주세요.");
                            memberNameArray[i] = sc.nextLine();
                            j=0;
                        }
                    }
                }


                }
            }

            System.out.println("");
            System.out.println("아기사자 명단을 최종적으로 출력합니다.");
            for (int i = 0; i < memberAmount; ++i) {
                System.out.printf("%d. %s\n", i+1, memberNameArray[i]);
            }

            System.out.println("==========================");
            System.out.println("프로그램을 종료하려면 'exit'을 입력하세요.");
            System.out.println("계속 아기사자를 입력하려면 'restart'를 입력하세요.");
            System.out.println("");
            exitOrRestart = sc.nextLine();

            if (exitOrRestart == "exit"); {
                System.out.println("아기사자 명단 관리 프로그램을 종료합니다.");
            }
        }

        

    }
    