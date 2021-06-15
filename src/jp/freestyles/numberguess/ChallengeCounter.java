package jp.freestyles.numberguess;

/**
 * トライ回数をあらわすクラス
 */
public class ChallengeCounter {

    private static final int MAX_COUNT_OF_CHALLENGE = Config.MAX_COUNT_OF_CHALLENGE;

    private int count;

    public ChallengeCounter() {
        this.count = 1;
    }

    public void countUp() {
        this.count++;
    }

    public boolean isOver() {
        return this.count > MAX_COUNT_OF_CHALLENGE;
    }

    public void showNumberOfTimesToAnswer() {
        System.out.format("答えられるのは %d 回までだよ。 %n", MAX_COUNT_OF_CHALLENGE);
    }

    public void showCounter() {
        System.out.format("%d 回目: ", this.count);
    }

    public int getCurrentValue() {
        return this.count;
    }
}
