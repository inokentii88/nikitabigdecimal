import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner skan = new Scanner(System.in);
        System.out.println("Введите число1:");
        BigDecimal num1 = skan.nextBigDecimal();
        System.out.println("Введите число2:" );
        BigDecimal num2 = skan.nextBigDecimal();
        BigDecimal res1 = (num1.add(num2));
        BigDecimal res2 = (num1.subtract(num2));
        BigDecimal res3 = (num1.multiply(num2));
        BigDecimal res4 = (num1.divide(num2));
        BigDecimal res5 = (num1.remainder(num2));
        System.out.println(res1 + "\n" + res2 + "\n" + res3 + "\n" + res4 + "\n" + res5 + "\n");
    }
}