package jp.freestyles.numberguess;

/**
 * 値同士の距離を定義する列挙子
 */
public enum DistanceTypes {

    JUST_LIL_BIT(5, "あとほんの少し"), LIL_BIT(10, "あと少し"), MORE_THAN(50, "それより"),
    STILL_MORE(100, "まだまだ"), MORE(200, "もっと"), OUT_OF_DISTANCE(1000, "まだかなり"),;

    private static final String MESSAGE_FOR_BIGGER_ANSWER = Config.MESSAGE_FOR_BIGGER_ANSWER;
    private static final String MESSAGE_FOR_SMALLER_ANSWER = Config.MESSAGE_FOR_SMALLER_ANSWER;
    private final int distance;
    private final String message;

    private DistanceTypes(int distance, String message) {
        this.distance = distance;
        this.message = message;
    }

    public static DistanceTypes getHowDistance(int distance) {

        for (DistanceTypes type : values()) {

            if (distance < type.distance) {
                return type;

            }
        }
        return OUT_OF_DISTANCE;
    }

    public static void showHowDistance(int distance, boolean isBig) {
        System.out.print(getHowDistance(distance).message);

        if (isBig) {
            System.out.println(MESSAGE_FOR_BIGGER_ANSWER);
            return;
        }
        System.out.println(MESSAGE_FOR_SMALLER_ANSWER);
    }

}
