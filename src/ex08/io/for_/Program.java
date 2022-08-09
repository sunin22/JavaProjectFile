package ex08.io.for_;

import java.util.Scanner;

public class Program {
    public static void main(String[] arg) {

        int kor1, kor2, kor3;
        int total;
        float avg;

        Scanner scan = new Scanner(System.in);

        kor1 = 0;
        kor2 = 0;
        kor3 = 0;

        while (true) //무한반복
        {
            //--------성적 입력 부분

            System.out.println("┌─────────────────────┐");
            System.out.println("│      \"성적입력\"     │");
            System.out.println("└─────────────────────┘");

            do {
                System.out.printf("국어1:");
                kor1 = scan.nextInt();  //값을 직접 입력하도록 화면 나타남//

                if(kor1 < 0 || 100 < kor1)
                    System.out.println("성적범위(0~100)를 벗어났습니다.");

            }while (kor1 < 0 || 100 < kor1);

            do {
                System.out.printf("국어2:");
                kor2 = scan.nextInt();  //값을 직접 입력하도록 화면 나타남//

                if(kor2 < 0 || 100 < kor2)
                    System.out.println("성적범위(0~100)를 벗어났습니다.");

            }while (kor2 < 0 || 100 < kor2);

            do {
                System.out.printf("국어3:");
                kor3 = scan.nextInt();  //값을 직접 입력하도록 화면 나타남//

                if(kor3 < 0 || 100 < kor3)
                    System.out.println("성적범위(0~100)를 벗어났습니다.");

            }while (kor3 < 0 || 100 < kor3);



            //---------성적 출력 부분 -------------

            total = kor1 + kor2 + kor3;
            avg = (float) (total / 3.0); //3.0은 double이라서 에러 -> (float)써주기
            // 또는 avg = total / 3.0f f를 써주면 float이 됨

            System.out.println("┌─────────────────────┐");
            System.out.println("│      \"성적출력\"     │");
            System.out.println("└─────────────────────┘");

            for(int i = 0; i < 3; i++) //이부분은 되도록이면 절대 바꾸지 않게 해보기! or (int n = 1; n<=3; n++)
                //System.out.printf("국어%d: %3d\n", i, kor1); 0부터 출력 (0,1,2)
                System.out.printf("국어%d: %3d\n", i+1, kor1); // +1을 하면 1부터 출력 가능!

            /* 3,2,1로 출력되게 만들어 보기
            for(int i = 0; i <3; i++)
                3 - i

            for(; i<3 ;) 이것도 작동 가능

            for(; true ;) 와 for( ; ; ) 같은 의미, 작동 가능하지만, 사용하지 않는게 바람직함

            for(int x = 0, int y = 0 ; x < 0 ; x++, y++)
             */

            System.out.printf("총점: %d\n", total);
            System.out.printf("평균: %6.2f\n", avg); //6는 소수점 포함 숫자수 자리
            System.out.println("───────────────────────");

        }
    }
} //ctrl + shift + f