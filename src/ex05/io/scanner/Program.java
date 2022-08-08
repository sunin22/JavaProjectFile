package ex05.io.scanner;

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

        //--------성적 입력 부분

        System.out.println("┌─────────────────────┐");
        System.out.println("│      \"성적입력\"     │");
        System.out.println("└─────────────────────┘");
        System.out.printf("국어1:");
        kor1 = scan.nextInt();  //값을 직접 입력하도록 화면 나타남
        System.out.printf("국어2:");
        kor2 = scan.nextInt();
        System.out.printf("국어3:");
        kor3 = scan.nextInt();


        //---------성적 출력 부분 -------------

        total = kor1 + kor2 + kor3;
        avg = (float) (total / 3.0); //3.0은 double이라서 에러 -> (float)써주기
        // 또는 avg = total / 3.0f f를 써주면 float이 됨

        System.out.println("┌─────────────────────┐");
        System.out.println("│      \"성적출력\"     │");
        System.out.println("└─────────────────────┘");

        System.out.printf("국어1: %d\n", kor1);
        System.out.printf("국어2: %d\n", kor2);
        System.out.printf("국어3: %d\n", kor3);
        System.out.printf("총점: %d\n", total);
        System.out.printf("평균: %6.2f\n", avg); //6는 소수점 포함 숫자수 자리
        System.out.println("───────────────────────");

    }
} //ctrl + shift + f