package ex17.io.Practice;

public class omok {
    public static void main(String[] args) {

        for (int x = 0; x < 10; x++)
            for (int y = 0; y < 10; y++)
                if(x==2 && y ==3)
                    System.out.printf("%c", '●');
                else if(x==0&&y==0)
                    System.out.printf("%c", '┌');
                else if(x==0&&y==8)
                    System.out.printf("%c", '┐');
                else if(x==9&&y==0)
                    System.out.printf("%c", '└');
                else if(x==9&&y==8)
                    System.out.printf("%c", '┘');

                else if(y == 9)
                    System.out.println();

                else if(x==0)  //이렇게 길게 쓰지 않고(x==0&&(0<=y&&y<9))
                    System.out.printf("%c", '┬');
                else if(y==8)  //((0<=x&&x<9)&&y==8)
                    System.out.printf("%c", '┤');
                else if(x==9)  //(x==9&&(0<=y&&y<9))
                    System.out.printf("%c", '┴');
                else if(y==0)  //((0<=x&&x<9)&&y==0)
                    System.out.printf("%c", '├');

                else if(y == 9)
                    System.out.println();

                else
                    System.out.printf("%c", '┼');


    /*  for (int x = 0; x < 10; x++){
            for (int y = 0; y < 10; y++)
                System.out.printf("%c", '+');

            System.out.println();
        }
     */
    }
}
