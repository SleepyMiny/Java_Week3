import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("1~12사이 숫자 하나를 입력하세요: ");
        int a = sc.nextInt();

        switch (a) {
            case 1, 2, 12:
                System.out.println("겨울");
                break;
            case 3, 4, 5:
                System.out.println("봄");
                break;
            case 6, 7, 8:
                System.out.println("여름");
                break;
            case 9, 10, 11:
                System.out.println("가을");
                break;
            default:
                System.out.println("1 ~ 12 사이 숫자만 입력하세요");
        }
    }
}

