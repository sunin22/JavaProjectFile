package ex17.io.Practice;

public class practice {
    public static void main(String[] args) {
        char star = '☆';
        int size = 0;
        int sizeopt = 10;

        for (int i = 0; i < 10; i++)
            System.out.printf("%c", star);

        for(int j = 0; j < 10 ; j++) { //이렇게 묶어야 별 10개 뒤에 다음칸 가능
            for (int i = 0; i < size; i++)
                System.out.printf("%c", star);
                size += 1;

            System.out.println();
            }

        for(int j = 0; j < 10 ; j++) { //이렇게 묶어야 별 10개 뒤에 다음칸 가능
            for (int i = 0; i < sizeopt; i++)
                System.out.printf("%c", star);
                sizeopt -= 1;

            System.out.println();

            /*
            for(int i = 0; i < 5; i++){
                if(i==2) 특수한 조건부터 먼저 앞에 두고
                    System.out.printf("%c", 'A'+i);
                else  나머지는 뒤에에
                   System.out.printf("%c", 'A'+i);
             */

        }
    }
}
