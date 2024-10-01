import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫번째 숫자를 입력하세요: ");
        int a = sc.nextInt();
        System.out.print("두번째 숫자를 입력하세요: ");
        int b = sc.nextInt();
        System.out.print("세번째 숫자를 입력하세요: ");
        int c = sc.nextInt();

        int d = 0;

        if( a > b ) {
            if( a > c ) {
                d = a;
            } else {
                d = c;
            }
        } else {
            if( b > c ) {
                d = b;
            } else {
                d = c;
            }
        }

        System.out.println("가장 큰숫자 : "+d);

    }
}
