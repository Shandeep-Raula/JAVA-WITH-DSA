public class SumAndAverage {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        double average = (double) sum / numbers.length;

        System.out.println("Sum of the numbers: " + sum);
        System.out.println("Average of the numbers: " + average);
    }
}
