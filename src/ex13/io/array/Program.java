package ex13.io.array;

import java.util.Scanner;

public class Program {
    public static void main(String[] arg) {

        //int kor1, kor2, kor3;
        int[] kors = new int[3];
        int total;
        float avg;
        int menu;

        Scanner scan = new Scanner(System.in);

        /*kor1 = 0;
        kor2 = 0;
        kor3 = 0;*/

        for(int i = 0; i < 3; i++)
            kors[i] = 0;

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

                    for(int i = 0; i < 3; i++)
                    do {
                        System.out.printf("국어%d:", i+1);
                        kors[i] = scan.nextInt();  //값을 직접 입력하도록 화면 나타남//

                        if (kors[i] < 0 || 100 < kors[i])
                            System.out.println("성적범위(0~100)를 벗어났습니다.");

                    } while (kors[i] < 0 || 100 < kors[i]);
                    break;

                    //---------성적 출력 부분 -------------
                case 2:
                    total = kors[1] + kors[2] + kors[0];
                    avg = (float) (total / 3.0); //3.0은 double이라서 에러 -> (float)써주기
                    // 또는 avg = total / 3.0f f를 써주면 float이 됨

                    System.out.println("┌─────────────────────┐");
                    System.out.println("│      \"성적출력\"     │");
                    System.out.println("└─────────────────────┘");

                    for (int i = 0; i < 3; i++) //이부분은 되도록이면 절대 바꾸지 않게 해보기! or (int n = 1; n<=3; n++)
                        //System.out.printf("국어%d: %3d\n", i, kor1); 0부터 출력 (0,1,2)
                        System.out.printf("국어%d: %3d\n", i + 1, kors[i]); // +1을 하면 1부터 출력 가능!

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

