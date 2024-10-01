import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("수학 점수를 입력하세요: ");
        int a = sc.nextInt();
        System.out.print("국어 점수를 입력하세요: ");
        int b = sc.nextInt();
        System.out.print("사회 점수를 입력하세요: ");
        int c = sc.nextInt();
        System.out.print("과학 점수를 입력하세요: ");
        int d = sc.nextInt();

        int avg = (a + b + c + d) / 4;

        if (avg >= 60) {
            System.out.println("합격");
        } else {
            System.out.println("불합격");
        }
    }
}
