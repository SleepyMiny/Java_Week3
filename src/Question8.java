import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("키를 입력하세요: ");
        double a = sc.nextDouble()/100;
        System.out.print("몸무게를 입력하세요: ");
        double b = sc.nextDouble();
        double bmi = b/(a*a);

        if (bmi <= 18.5) {
            System.out.println("저체중");
        } else if (bmi <= 24.9) {
            System.out.println("정상");
        } else if (bmi <= 29.9) {
            System.out.println("과체중");
        } else {
            System.out.println("비만");
        }
        System.out.println(bmi);
    }
}
