import java.util.Scanner;

public class CalculationMethod {
    public static void calculate() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите фактическое количество готовой эмали: ");
        double startValue = scanner.nextInt();
        System.out.print("Введите полный объём эмали: ");
        double endValue = scanner.nextInt();
        System.out.println("Введите 1, если нужно " + (int) endValue + " густой эмали\n" +
                "Введите 2, если нужно " + (int) endValue + " готовой эмали");
        int readingValue = scanner.nextInt();
        scanner.close();

        double readyValue;
        if (readingValue == 1) {
            readyValue = (startValue / 1.5) * (endValue / (startValue / 1.5) - 1);
            System.out.printf("Долить густой: %.1f\n", readyValue);
        } else if (readingValue == 2) {
            readyValue = ((endValue / startValue) - 1) * startValue;
            System.out.printf("Долить готовой: %.1f\n", readyValue);
        }
    }
}
