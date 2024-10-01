import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 숫자: ");
        int a = sc.nextInt();

        System.out.print("두 번째 숫자: ");
        int b = sc.nextInt();

        System.out.print("연산자(+,-,*,/): ");
        String c = sc.next();

        int Sum = 0;

        switch (c) {
            case "+":
                Sum = a + b;
                break;
            case "-":
                Sum = a - b;
                break;
            case "*":
                Sum = a * b;
                break;
            case "/":
                Sum = a / b;
                break;
            default:
                System.out.println("에러");
        }
        System.out.println("결과: " + Sum);
    }
}
