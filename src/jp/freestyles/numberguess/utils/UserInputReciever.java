package jp.freestyles.numberguess.utils;

import java.util.Scanner;

/**
 * ユーザの入力受付けをあらわすクラス
 */
public class UserInputReciever {

    private static final Scanner STDIN;

    static {
        STDIN = new Scanner(System.in);
    }

    // TODO: マイナス値の入力に対するバリデーションが不足している
    public static int recieveNumberSequence(int digit) {

        String inputStr = recieveStr();

        if (isNumber(inputStr)) {
            if (isOverDigitRange(inputStr, digit)) {
                showMessageOfInvalidRequiredDigit(digit);
                return recieveNumberSequence(digit);
            }
            return Integer.parseInt(inputStr);
        } else {
            showMessageOfInvalidInputForNumber();
        }

        return recieveNumberSequence(digit);
    }

    private static boolean isNumber(String inputStr) {
        try {
            Integer.parseInt(inputStr);

        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    private static void showMessageOfInvalidRequiredDigit(int digit) {
        System.out.format("%d 桁の数字で入力してください %n", digit);
    }

    private static boolean isOverDigitRange(String inputStr, int digit) {
        return inputStr.length() > digit;
    }

    public static String recieveStr() {
        return STDIN.nextLine();
    }

    private static void showMessageOfInvalidInputForNumber() {
        System.out.println("数字で入力してください");
    }
}
