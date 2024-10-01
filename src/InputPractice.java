import java.util.Scanner;

public class InputPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 숫자: ");
        int a = sc.nextInt();

        System.out.print("두 번째 숫자: ");
        int b = sc.nextInt();

        System.out.print("연산자(+,-,*,/): ");
        String c = sc.next();

        System.out.println("결과 : " + a + " " + c + " " + b);
        sc.close();

    }
}
