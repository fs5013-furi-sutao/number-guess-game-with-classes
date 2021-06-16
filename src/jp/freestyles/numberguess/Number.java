package jp.freestyles.numberguess;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 数字の並びをあらわすクラス
 */
public class Number {

    private static final int RANGE_IN_ONE_DIGIT = 10;
    private static final Random RANDOM = new Random();

    private final int DIGIT;
    private List<Integer> numberSequence;

    public Number(int digit) {
        this.DIGIT = digit;
        initNumberSequence();
    }

    private void initNumberSequence() {
        this.numberSequence = new ArrayList<>();
        for (int i = 0; i < this.DIGIT; i++) {
            this.numberSequence.add(0);
        }
    }

    public void generateRandomNum() {

        for (int i = 0; i < this.DIGIT; i++) {
            this.numberSequence.set(i, getRandomNum());
        }
    }

    private int getRandomNum() {
        return RANDOM.nextInt(RANGE_IN_ONE_DIGIT);
    }

    public int getValue() {

        String numberStr = "";
        for (int number : numberSequence) {
            numberStr += number;
        }
        return Integer.parseInt(numberStr);
    }

    public void showValue() {
        System.out.println(getValue());
    }

    public void setInteger(int userInputNum) {
        String numStr = String.format("%03d", userInputNum);
        for (int i = 0; i < DIGIT; i++) {
            String targetNumStr = numStr.substring(i, i + 1);
            int targetNumInteger = Integer.parseInt(targetNumStr);
            this.numberSequence.set(i, targetNumInteger);
        }
    }

    public static boolean isCorrect(Number correct, Number currentUserAnswer) {
        return correct.getValue() == currentUserAnswer.getValue();
    }

    public static int getDiff(Number correct, Number currentUserAnswer) {
        return Math.abs(correct.getValue() - currentUserAnswer.getValue());
    }

    public static boolean getIsBig(Number correct, Number currentUserAnswer) {
        return correct.getValue() < currentUserAnswer.getValue();
    }
}
