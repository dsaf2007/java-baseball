package baseball.view;

public class OutputView {

    private static String START_MESSAGE = "숫자 야구 게임을 시작합니다.";
    private static String INPUT_GUIDE_MESSAGE = "숫자를 입력해주세요 : ";
    private static String GAMEOVER_MESSAGE = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";

    public static void startMessage() {
        System.out.println(START_MESSAGE);
    }

    public static void gameoverMessage() {
        System.out.println(GAMEOVER_MESSAGE);
    }

    public static void inputGuideMessage() {
        System.out.print(INPUT_GUIDE_MESSAGE);
    }

}
