package ex055.ioOperator;

public class PrePostDemo {
    public static void main(String[] args){
        int i = 3;
        i++;
        System.out.println(i); //4

        ++i;
        System.out.println(i); //5

        System.out.println(++i); //6
        System.out.println(i++); //6 이후에 출력시 1 추가됨
        System.out.println(i); // 7
    }
}
