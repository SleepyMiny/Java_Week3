import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("연산자를 입력하세요 ");
        String a = sc.next();
        System.out.print("숫자 두개를 입력하세요 ");
        int b = sc.nextInt();
        int c = sc.nextInt();
        double sum = 0;

        switch (a) {
            case "+":
                sum = b + c;
                break;
            case "-":
                sum = b - c;
                break;
            case "*":
                sum = b * c;
                break;
            case "/":
                if (c == 0) {
                    System.out.println("0으로 나눌 수 없습니다.");
                } else {
                    sum = (double) b / c;
                }
                break;
            default:
                System.out.println("에러");
        }
        System.out.println(sum);
    }
}
