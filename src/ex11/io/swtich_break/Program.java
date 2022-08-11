package ex11.io.swtich_break;

import java.util.Scanner;

public class Program {
    public static void main(String[] arg) {

        int kor1, kor2, kor3;
        int total;
        float avg;
        int menu;

        Scanner scan = new Scanner(System.in);

        kor1 = 0;
        kor2 = 0;
        kor3 = 0;

        종료:
        while (true) //무한반복
        {
            //--------메인 메뉴 부분

            System.out.println("┌─────────────────────┐");
            System.out.println("│     \"메인 메뉴\"     │");
            System.out.println("└─────────────────────┘");

            System.out.println("\t1.성적입력");
            System.out.println("\t2.성적출력");
            System.out.println("\t3.종료");

            System.out.print("\t>");
            menu = scan.nextInt();

            switch (menu) {
                //--------성적 입력 부분

                case 1:
                    System.out.println("┌─────────────────────┐");
                    System.out.println("│      \"성적입력\"     │");
                    System.out.println("└─────────────────────┘");

                    do {
                        System.out.printf("국어1:");
                        kor1 = scan.nextInt();  //값을 직접 입력하도록 화면 나타남//

                        if (kor1 < 0 || 100 < kor1)
                            System.out.println("성적범위(0~100)를 벗어났습니다.");

                    } while (kor1 < 0 || 100 < kor1);

                    do {
                        System.out.printf("국어2:");
                        kor2 = scan.nextInt();  //값을 직접 입력하도록 화면 나타남//

                        if (kor2 < 0 || 100 < kor2)
                            System.out.println("성적범위(0~100)를 벗어났습니다.");

                    } while (kor2 < 0 || 100 < kor2);

                    do {
                        System.out.printf("국어3:");
                        kor3 = scan.nextInt();  //값을 직접 입력하도록 화면 나타남//

                        if (kor3 < 0 || 100 < kor3)
                            System.out.println("성적범위(0~100)를 벗어났습니다.");

                    } while (kor3 < 0 || 100 < kor3);
                    break;

                    //---------성적 출력 부분 -------------
                case 2:
                    total = kor1 + kor2 + kor3;
                    avg = (float) (total / 3.0); //3.0은 double이라서 에러 -> (float)써주기
                    // 또는 avg = total / 3.0f f를 써주면 float이 됨

                    System.out.println("┌─────────────────────┐");
                    System.out.println("│      \"성적출력\"     │");
                    System.out.println("└─────────────────────┘");

                    for (int i = 0; i < 3; i++) //이부분은 되도록이면 절대 바꾸지 않게 해보기! or (int n = 1; n<=3; n++)
                        //System.out.printf("국어%d: %3d\n", i, kor1); 0부터 출력 (0,1,2)
                        System.out.printf("국어%d: %3d\n", i + 1, kor1); // +1을 하면 1부터 출력 가능!

                    System.out.printf("총점: %d\n", total);
                    System.out.printf("평균: %6.2f\n", avg); //6는 소수점 포함 숫자수 자리
                    System.out.println("───────────────────────");

                    break;

                case 3:
                    break 종료; //switch문까지만 해당되고 while문에서는 해당 안됨 -> 종료를 써주기

                default: //else
                    System.out.println("입력 오류: 1~3까지만 입력할 수 있습니다.");
            }
        }
        System.out.println("Good bye!");
    }
}//ctrl + shift + f


/* 이렇게 하면 에러. 왜냐하면 1번을 하고 나면 1번은 제외하고 2번 또는 3번으로 넘어가야 하는데
if만 쓰면 1번 이후에도 계속 if만 3번 쓰면 다시 돌아옴
실행 결과는 똑같아 보이지만 내부의 프로세스, 절차는 다르게 정리됨

그러나 if-elseif는 모든 조건을 돌아보게 만들어서 가장 뒤의 선택지는 시간이 오래걸림
switch-case가 모든 조건 상관없이 번호 선택해서 바로 실행하게 만듦
단, 1번을 실행하면 2, 3번까지 내리 실행됨. 따라서 break가 필요함
 */
