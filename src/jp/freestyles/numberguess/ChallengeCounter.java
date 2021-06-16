package jp.freestyles.numberguess;

/**
 * トライ回数をあらわすクラス
 */
public class ChallengeCounter {

    private static final int NUMBER_OF_MAX_TIMES_TO_ANSWER = Config.NUMBER_OF_MAX_TIMES_TO_ANSWER;

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
        System.out.format("答えられるのは %d 回までだよ。 %n",
                NUMBER_OF_MAX_TIMES_TO_ANSWER);
    }

    public void showCounter() {
        System.out.format("%d 回目: ", this.count);
    }

    public int getCurrentValue() {
        return this.count;
    }
}
