package jp.freestyles.numberguess;

/**
 * 数当てゲームを繰り広げる場所をあらわすクラス
 */
public class Playground {

    private static final boolean IS_DEBUG_MODE = Config.IS_DEBUG_MODE;

    private static final String GAME_START_MESSAGE = Config.GAME_START_MESSAGE;
    private static final String MESSAGE_WHEN_HIT = Config.MESSAGE_WHEN_HIT;
    private static final String MESSAGE_WHEN_NOT_HIT = Config.MESSAGE_WHEN_NOT_HIT;

    private static final int DIGIT = Config.DIGIT;

    private Number correct;
    private Number currentUserAnswer;
    private Judger judger;
    private ChallengeCounter challengeCounter;

    public Playground() {
        this.correct = new Number(DIGIT);
        this.currentUserAnswer = new Number(DIGIT);
        this.challengeCounter = new ChallengeCounter();
    }

    public void play() {

        showStartMessage();
        setCorrect();
        showCorrect(IS_DEBUG_MODE);

        while (!this.challengeCounter.isOver()) {

            this.challengeCounter.showCounter();
            recieveUserInput();
            initJudger();

            if (judger.isCorrect()) {
                break;
            }

            judger.showResult();
            this.challengeCounter.countUp();
        }
        showFinalResult();
    }

    private void initJudger() {
        this.judger = new Judger(this.correct, this.currentUserAnswer);
    }

    private void showFinalResult() {
        if (this.challengeCounter.isOver()) {
            showMessageWhenNotHit();
            return;
        }
        showMessageWhenHit();
    }

    private void showMessageWhenNotHit() {
        System.out.format(MESSAGE_WHEN_NOT_HIT, this.correct.getValue());
    }

    private void showMessageWhenHit() {
        System.out.format(MESSAGE_WHEN_HIT,
                this.challengeCounter.getCurrentValue());
    }

    private void showCorrect(boolean isDebugMode) {
        if (isDebugMode) {
            System.out.print("[DEBUG] correct=");
            this.correct.showValue();
        }
    }

    private void showStartMessage() {
        System.out.println(GAME_START_MESSAGE);
        System.out.println();
        this.challengeCounter.showNumberOfMaxTimesToAnswer();
        System.out.println();
    }

    private void recieveUserInput() {
        int userInputNum = UserInputReciever.recieveNumberSequence(DIGIT);
        this.currentUserAnswer.setInteger(userInputNum);
    }

    private void setCorrect() {
        this.correct.generateRandomNum();
    }
}
