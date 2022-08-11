package ex12.io.continue_break;

import java.util.Scanner;

public class Program {
    public static void main(String[] arg) {
        int n = 0;

        Scanner scan = new Scanner(System.in);
        System.out.print("값을 sp로 구분해서 5개 이상 입력하세요:");


        //3 enter, 34 5 6 234 enter -> nextInt는 어떤수이든 앞숫자만 출력

        while (scan.hasNext()) {//다음값이 있는지 없는지 확인 후 출력력
            n = scan.nextInt();

            if(n < 10)
                continue;

            if(n > 300)
                break;

            System.out.println(n);
        }
    }
}
