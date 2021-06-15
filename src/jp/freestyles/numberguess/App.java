package jp.freestyles.numberguess;

/**
 * 数当てゲーム
 * ゲームの起点となるクラスです
 */
public class App {
    public static void main(String[] args) {

        Playground field = new Playground();
        field.play();
    }
}
