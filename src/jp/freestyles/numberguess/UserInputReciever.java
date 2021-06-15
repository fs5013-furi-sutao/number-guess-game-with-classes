package jp.freestyles.numberguess;

import java.util.Scanner;

/**
 * ユーザの入力受付けをあらわすクラス
 */
public class UserInputReciever {

    private static final Scanner STDIN;

    static {
        STDIN = new Scanner(System.in);
    }

    public static int recieveNumbers() {

        String inputStr = recieveStr();
        int inputInteger = 0;
        try {
            inputInteger = Integer.parseInt(inputStr);

        } catch (NumberFormatException e) {
            showMessageOfInvalidInputForNumber();
            inputInteger = recieveNumbers();
        }
        return inputInteger;
    }

    public static int recieveNumbersIn(int digit) {

        int recievedNumber = recieveNumbers();
        if (isOverDigitRange(recievedNumber, digit)) {
            showMessageOfInvalidRequiredDigit(digit);
            recieveNumbersIn(digit);
        }
        return recievedNumber;
    }

    private static void showMessageOfInvalidRequiredDigit(int digit) {
        System.out.format("%d 桁の数字で入力してください %n", digit);
    }

    private static boolean isOverDigitRange(int recievedNumber, int digit) {
        return String.valueOf(recievedNumber).length() > digit;
    }

    public static String recieveStr() {
        return STDIN.nextLine();
    }

    private static void showMessageOfInvalidInputForNumber() {
        System.out.println("数字で入力してください");
    }
}
