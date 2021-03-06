package jp.freestyles.numberguess.config;

/**
 * 設定値を決めるクラス
 */
public class Config {

    // デバッグ機能の ON/OFF
    public static final boolean IS_DEBUG_MODE = true;

    // 表示メッセージの設定
    // use in Playground.java
    public static final String GAME_START_MESSAGE = "数字を当ててみてね。";
    public static final String MESSAGE_WHEN_HIT = "すごい！！%d 回で当てられちゃった！";
    public static final String MESSAGE_WHEN_NOT_HIT = "残念！！ 正解は %d でした！";
    // use in DistanceTypes.java
    public static final String MESSAGE_FOR_BIGGER_ANSWER = "小さい数字だよ";
    public static final String MESSAGE_FOR_SMALLER_ANSWER = "大きい数字だよ";
    // use in ChallengeCounter.java
    public static final int COUNT_AT_STARTUP = 1;
    public static final String MESSAGE_FOR_COUNTER = "%d 回目: ";
    public static final String MESSAGE_FOR_NUMBER_OF_MAX_TIMES_TO_ANSWER = "答えられるのは %d 回までだよ。 %n";

    // 当てる数の桁数設定
    public static final int DIGIT = 3;

    // 許容される数当ての挑戦回数
    public static final int NUMBER_OF_MAX_TIMES_TO_ANSWER = 5;
}
