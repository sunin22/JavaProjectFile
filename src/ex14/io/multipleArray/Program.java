package ex14.io.multipleArray;

import java.util.Scanner;

public class Program {
    public static void main(String[] arg) {

        //int kor1, kor2, kor3;
        int[] kors = new int[3*3]; //2차원
        int total;
        float avg;
        int menu;

        Scanner scan = new Scanner(System.in);

        /*kor1 = 0;
        kor2 = 0;
        kor3 = 0;*/

        for(int j = 0; j < 3; j ++)
            for(int i = 0; i < 3; i++)
                kors[3*j+i] = 0;

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

                    for(int j = 0; j < 3; j++)
                        for(int i = 0; i < 3; i++)
                        do {
                            System.out.printf("%d학년 국어%d:", j+1, i+1);
                            kors[3*j+i] = scan.nextInt();  //값을 직접 입력하도록 화면 나타남//

                            if (kors[3*j+i] < 0 || 100 < kors[3*j+i])
                                System.out.println("성적범위(0~100)를 벗어났습니다.");

                        } while (kors[3*j+i] < 0 || 100 < kors[3*j+i]);
                        break;

                    //---------성적 출력 부분 -------------
                case 2:
                    System.out.println("┌─────────────────────┐");
                    System.out.println("│      \"성적출력\"     │");
                    System.out.println("└─────────────────────┘");

                    for(int j = 0; j < 3; j++) { //가로 하지 않으면 오류
                        total = kors[3 * j + 0] + kors[3 * j + 1] + kors[3 * j + 2];
                        avg = total / 3.0f; //오류 나서 다음 프로그램 코드에서 수정

                        System.out.printf("<%d학년 국어성적>-----------------\n", j + 1);

                        for (int i = 0; i < 3; i++)
                            System.out.printf("\t국어%d : %3d\n", i+1, kors[3*j+i]); //j+1을 뻬야지 에러 없음


                        System.out.printf("총점: %d\n", total);
                        System.out.printf("평균: %6.2f\n", avg); //6는 소수점 포함 숫자수 자리
                        System.out.println("───────────────────────");
                    }
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

