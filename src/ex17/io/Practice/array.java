package ex17.io.Practice;

public class array {
    public static void main(String[] args){

        int nums[] = {1,2,3,4,5,6,7};

        for(int i = 0; i<7; i++)
            System.out.printf("%d ", nums[i]); //[i]가 들어가야 오류가 안남!

        // nums[7] = 8;은 바로 넣을 수 없음. 원래 값들을 이주시키는 방법 밖에 없음

        int[] temp = new int[10];

        for(int i = 0; i<7; i++)
            temp[i] = nums[i];

        nums = temp; //nums 배열을 교체, 이걸 써줘야 nums 배열이 바뀜

        nums[7] = 8;

        for(int i = 0; i<8; i++)
            System.out.printf("%d ", nums[i]);

        //배열 합치기
        int[] nums1 = {1,2,3};
        int[] nums2 = {4,5,6};
        int[] nums3 = new int[6];

        for(int i = 0; i<3; i++)
            nums3[i] = nums1[i];

        for(int i = 0; i<3; i++)
            nums3[i+3] = nums2[i]; //nums3[i] = nums2[i]가 아니라

        for(int i = 0; i<6; i++)
            System.out.printf("%d ", nums3[i]);



        /*
        int nums[] = 배열 선언법
        int[] nums = 최근 버전

        int[] nums = new int[7]; -> for(int i = 0; i <7; i++) nums[i] = i + 1;
        int[] nums = new int[]{1,2,3,4,5,6,7}; 과거 버전
        int[] nums = {1,2,3,4,5,6,7}; 최근 버전, 추천

        for(int i = 0; i <7; i++)   //   for(int i = 0; i < nums.length; i++) 이건 나중에 익숙해지면 추천
            System.out.printf("%d", nus[i]);

        1차원 배열
        int[] lotto = new int[6];

        다차원 배열
        int[][] lottos = new int[3][6]; 18개. 6개씩 3공간

        lottos[0][0] = 3;
        System.out.printf("%d", lottos[0][0]);

        lottos[0] = new int[9]; 에러 아님!
        System.out.printf("%d", lottos[0][0]);

        자바에서 [3][6]에서 3은 이름표, 1번째 차원이라 6과는 다름. 따라서
        [0]번에 new int[9]라는 새로운 배열을 연결시킬 수 있는게 자바 배열의 특징
        -> 오류, 문제 발생 가능성이 높아짐!

        1)1,2차 배열 모두 지정하는 법: int[][] lottos = new int[3][6];
        2)1차 배열만 지정하고 2차는 비워두는 법:
        int[][] lottos = new int[3][]; 2차에 다르게 넣을 수 있음
        lottos[0] = new int[3];
        lottos[1] = new int[5];
        lottos[2] = new int[9];

         */
    }
}
