import java.util.Scanner;

/**
 * 문자열 계산기
 */
public class StringCalculator {
    static int result = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();
        String[] values = value.split(" ");
        result = Integer.parseInt(values[0]);
//        for (int i = 0; i < values.length - 2; i += 2) {
//            result = calculate(result, Integer.parseInt(values[i + 2]), values[i + 1]);
//        }
        System.out.println(result);
    }

    public int calculate(int result, int num, String sign) {
        System.out.println(result);
        System.out.println(num);
        System.out.println(sign);
        System.out.println("-------------");

        switch (sign) {
            case "+":
                result += num;
                break;
            case "-":
                result -= num;
                break;
            case "*":
                result *= num;
                break;
            case "/":
                result /= num;
                break;
        }

        return result;
    }
}