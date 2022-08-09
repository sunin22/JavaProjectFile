package ex09.io.for_math;

import java.util.Scanner;

public class Program {
    public static void main(String[] arg) {

       int total = 0;

      /* total += 1;
       total += 2;
       total += 3;
       total += 4;
       total += 5;
       total += 6;*/


        // 1 ~ 10까지 숫자 더하기
       for( int i = 0; i <10; i++)
           total += i + 1;

       System.out.printf("total is %d\n", total);

       // 3 ~ 7까지

        int total1 = 0;
        for (int i = 0; i < 5; i++)
            total1 += i + 3;

        System.out.printf("total 1 is %d\n", total1);

        //합을 구하는 공식 sn = (n(2a + (n-1)d)/2   |  sn = (n(a + l))/ 2

        int total2 = 0;
        total2 = 5 * (3+7) / 2;
        System.out.printf("total 2 is %d\n", total2);
    }
} //ctrl + shift + f