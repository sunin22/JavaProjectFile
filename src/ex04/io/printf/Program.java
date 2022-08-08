package ex04.io.printf;

public class Program {
    public static void main(String[] arg) {

        int kor1, kor2, kor3;
        int total;
        float avg;

        kor1 = 50;
        kor2 = 60;
        kor3 = 80;

        total = kor1 + kor2 + kor3;
        avg = (float) (total / 3.0); //3.0은 double이라서 에러 -> (float)써주기
        // 또는 avg = total / 3.0f f를 써주면 float이 됨


        //---------성적 출력 부분 -------------

        System.out.println("┌─────────────────────┐");
        System.out.println("│      \"성적출력\"     │");
        System.out.println("└─────────────────────┘");

        System.out.printf("국어1: %d\n", kor1);
        System.out.printf("국어2: %d\n", kor2);
        System.out.printf("국어3: %d\n", kor3);
        System.out.printf("총점: %d\n", total);
        System.out.printf("평균: %6.2f\n", avg); //6는 소수점 포함 숫자수 자리
        System.out.println("───────────────────────");


        System.out.printf("%2$d %3$d %1$d\n", 1,2,3); //배열을 지정하기
        System.out.printf("%1$d %1$d %1$d\n", 2); //같은 값 세번 출력


        System.out.write(80); //p출력
        System.out.flush();
        System.out.print(80);    //80출력

    }
} //ctrl + shift + f