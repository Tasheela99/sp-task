public class ProblemOne {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        ProblemOne problemOne = new ProblemOne();
        System.out.println(problemOne.recursive(numbers,9));


    }

    private int forLoop(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    private int whileLoop(int[] numbers) {
        int sum = 0;
        int i = 0;
        while (i < numbers.length) {
            sum += numbers[i];
            i++;
        }
        return sum;
    }

    private int recursive(int[] numbers, int index) {
        if (index < 0) {
            return 0;
        }
        return numbers[index] + recursive(numbers, index - 1);
    }

}
