package jp.freestyles.numberguess.domain;

import jp.freestyles.numberguess.config.DistanceTypes;

/**
 * 正解とユーザの入力した数字を比較・判定するクラス
 */
public class Judger {

    private NumberSequence correct;
    private NumberSequence currentUserAnswer;

    public Judger(NumberSequence correct, NumberSequence currentUserAnswer) {
        this.correct = correct;
        this.currentUserAnswer = currentUserAnswer;
    }

    public boolean isCorrect() {
        return NumberSequence.isCorrect(this.correct, this.currentUserAnswer);
    }

    public void showResult() {
        int distance = NumberSequence.getDiff(this.correct,
                this.currentUserAnswer);
        boolean isBig = NumberSequence.getIsBig(this.correct,
                this.currentUserAnswer);

        DistanceTypes.showHowDistance(distance, isBig);
    }
}
