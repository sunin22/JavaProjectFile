package ex17.io.Practice;

import java.util.Random;

public class arrayposition {
    public static void main(String[] args){

        //1. 배열에서 일치하는 항목의 위치 얻어오기

        int[] nums = {5,2,7,4,6,1,3};

        // Q. 1의 위치를 찾기
        /* 내가 해본 코드
        for(int i = 0; i<6; i++)
            if (nums[i] == 1)
                System.out.printf();
            else
                continue; */

        int index = -1; //보통 인덱스 안에 없는 숫자를 넣어서 시작

        for(int i = 0; i<7; i++)
            if (nums[i] == 1) {
                index = i;
                break;
            }
        System.out.printf("Index is %d\n", index);



        // 2. 배열 값 교환하기
        /* 배열의 역할: 데이터 -> 변형 -> 출력
        변형 중 자리바꾸기가 흔함
         */

        for(int i=0;i<7;i++)
            System.out.printf("%d", nums[i]);
            System.out.println();

        int temp;
        temp = nums[1];
        nums[1] =nums[3];
        nums[3] = temp;

        for(int i=0;i<7;i++)
            System.out.printf("%d", nums[i]);
            System.out.println();


        /* for(int i=0; i<6; i++)
            numbs[i] = numbers[i];

        numbers = numbs;

        numbs[7] = 7;

        for(int i=0; i<7; i++)
            System.out.printf("%d", numbs[i]);
*/

        /* 3. Random 값을 주는 도구
        Random rand = new Random();
        rand.nextInt(45); 0~44까지 Scanner와 같은 역할
         */

        Random rand = new Random();

        int[] lotto = new int[6];

        //lotto[0] = rand.nextInt(45)+1;
        //pseudorandom 가짜의 랜덤 숫자 반환, 0부터 반환되서 + 1 보정하기 / 45가지의 숫자중 랜덤으로 반환

        for (int i=0;i<6;i++)
            lotto[i] = rand.nextInt(45)+1; // 번호 6개 랜덤으로 뽑는법


        for (int i=0;i<6;i++)
            System.out.printf("%d ",lotto[i]); // 번호 6개 출력




    }
}
