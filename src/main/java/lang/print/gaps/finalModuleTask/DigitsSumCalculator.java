package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public static void calculateSum(int number) {
        String str = Integer.toString(number);

        int result = 0;

        for (char ch : str.toCharArray()) {
            result += Character.getNumericValue(ch);
        }

        System.out.println(result);
    }

    public static void main(String[] args) {
        calculateSum(4567);
    }
}
