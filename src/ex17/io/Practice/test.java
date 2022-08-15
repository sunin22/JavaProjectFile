package ex17.io.Practice;

public class test {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if (i == 4) //if와 else는 한 세트, 특별한 조건을 먼저 적기
                System.out.printf("%c\n", 'A' + i);

            else if (i % 2 == 0) //2로 나눈 값의 나머지가 0이면 짝수
                System.out.printf("%c, ", ' '); //빈칸으로 처리

            else
                System.out.printf("%c, ", 'A' + i); //ABCDE
        }
/*범위가 가장 작은 수부터 가장 위에 우선순위로 올려넣기
1) 1==4, 2) i % 2 == 0, 3) 나머지 -> 어기면 결과가 다르게 나옴
 */

        for (int i = 0; i < 9; i++) {
            System.out.printf("%d", i + 1);
            if (i % 3 == 2)
                System.out.println();
        }

        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 3; x++)                   // 0*3 + 0,1,2 = 012
                System.out.printf("%d", (y * 3 + x)+1);   // 1*3 + 0,1,2 = 345
            System.out.println();                         // 2*3 + 0,1,2 = 678
        }

        /*
        123  위와 아래 결과는 모두 같음
        456  격자로 보일 떄는 변수를 x와 y로 좌표처럼 생각해서 만들기
        789  일자형 목록일 때는 if문으로 예외주기
         */
    }
}

