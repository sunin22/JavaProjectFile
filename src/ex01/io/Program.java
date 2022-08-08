package ex01.io;

public class Program {
    public static void main(String[] args) {

        System.out.write('3'); //그냥 3이면 나오지 않음
        System.out.write(3); //3에 해당하는 기호값
        System.out.write(51); //51에 해당하는 기호값이 3
        System.out.write('3'+1); //
        System.out.write(51 +1); // 3+1이 되서 4

        System.out.write('A' + 0);
        System.out.write('A' + 1);
        System.out.write('A' + 2);
        System.out.write('A' + 3);

        System.out.flush(); //프린트처럼 출력
    }
}
