public class ProblemThree {
    public static void main(String[] args) {
        int count = 100;
        Fibonacci(count);
    }

    static void Fibonacci(int count) {
        int num1 = 0;
        int num2 = 1;

        for (int i = 0; i < count; i++) {
            System.out.println(i+1 +" " + num1 + " ");
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;

        }
    }
}
