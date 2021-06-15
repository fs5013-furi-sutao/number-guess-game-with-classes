package jp.freestyles.numberguess;

/**
 * 正解とユーザの入力した数字を比較・判定するクラス
 */
public class Judger {

    private Number correct;
    private Number currentUserAnswer;

    public Judger(Number correct, Number currentUserAnswer) {
        this.correct = correct;
        this.currentUserAnswer = currentUserAnswer;
    }

    public boolean isCorrect() {
        return Number.isCorrect(this.correct, this.currentUserAnswer);
    }

    public void showResult() {
        int distance = Number.getDiff(this.correct, this.currentUserAnswer);
        boolean isBig = Number.getIsBig(this.correct, this.currentUserAnswer);

        DistanceTypes.showHowDistance(distance, isBig);
    }
}
