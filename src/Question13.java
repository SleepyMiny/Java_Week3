import java.util.Scanner;

public class Question13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫번째 숫자를 입력하세요: ");
        int a = sc.nextInt();
        System.out.print("첫번째 연산자를 입력하세요 ");
        String d = sc.next();
        System.out.print("두번째 숫자를 입력하세요: ");
        int b = sc.nextInt();
        System.out.print("두번째 연산자를 입력하세요 ");
        String e = sc.next();
        System.out.print("세번째 숫자를 입력하세요: ");
        int c = sc.nextInt();

        double sum1 = 0;
        double sum2 = 0;
        double sum3 = 0;

        switch (d) {
            case "*":
                sum1 = a * b;
                break;
            case "/":
                if (b == 0) {
                    System.out.println("0으로 나눌 수 없습니다.");
                } else {
                    sum1 = (double) a / b;
                }
                break;
            case "+", "-":
                sum1 = b;
                break;
            default:
                System.out.println("에러");
        }

        switch (e) {
            case "+":
                sum2 = sum1 + c;
                break;
            case "-":
                sum2 = sum1 - c;
                break;
            case "*":
                sum2 = sum1 * c;
                break;
            case "/":
                if (c == 0) {
                    System.out.println("0으로 나눌 수 없습니다.");
                } else {
                    sum2 = (double) sum1 / c;
                }
                break;
            default:
                System.out.println("에러");
        }

        switch (d) {
            case "+":
                sum3 = sum2 + a;
                break;
            case "-":
                sum3 = sum2 - a;
                break;
            case "*", "/":
                sum3 = sum2;
                break;
            default:
                System.out.println("에러");
        }




        System.out.println(sum3);

    }
}
