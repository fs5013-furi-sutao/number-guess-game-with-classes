package jp.freestyles.numberguess.domain;

import jp.freestyles.numberguess.config.Config;

/**
 * トライ回数をあらわすクラス
 */
public class ChallengeCounter {

    private static final int NUMBER_OF_MAX_TIMES_TO_ANSWER = Config.NUMBER_OF_MAX_TIMES_TO_ANSWER;
    private static final String MESSAGE_FOR_COUNTER = Config.MESSAGE_FOR_COUNTER;
    private static final String MESSAGE_FOR_NUMBER_OF_MAX_TIMES_TO_ANSWER = Config.MESSAGE_FOR_NUMBER_OF_MAX_TIMES_TO_ANSWER;

    private int count;

    public ChallengeCounter() {
        this.count = 1;
    }

    public void countUp() {
        this.count++;
    }

    public boolean isOver() {
        return this.count > NUMBER_OF_MAX_TIMES_TO_ANSWER;
    }

    public void showNumberOfMaxTimesToAnswer() {
        System.out.format(MESSAGE_FOR_NUMBER_OF_MAX_TIMES_TO_ANSWER,
                NUMBER_OF_MAX_TIMES_TO_ANSWER);
    }

    public void showCounter() {
        System.out.format(MESSAGE_FOR_COUNTER, this.count);
    }

    public int getCurrentValue() {
        return this.count;
    }
}
