public class OperatorExample2 {
    public static void main(String[] args) {
        int a = 10;

        int result = (++a * 2 + 3 > 10) ? 10 - 2 : 10 + 2;

        System.out.println("Result: " + result);
    }
}
