package baseball;

import camp.nextstep.edu.missionutils.Console;

public class Game {

    /*
     * 게임의 엔진 역할을 하는 메인루프
     * 게임 진행에 필요한 각 클래스를 호출하고 프로세스에 따라 게임 진행
     */

    private static Computer com = new Computer();
    private static Judge judge = new Judge();
    private static String outputStr = "";

    public Game() {
        com.createNumber();
        judge.resetScore();
    }

    public void run() {

        boolean gameStatus = true;
        startGame();
        while (gameStatus) {
            innings();
            if (judge.isGameOver()) {
                gameStatus = endGame();
            }
        }
    }

    private void startGame() {
        OutputView.startMessage(); // 게임시작
    }

    private void innings() {
        OutputView.inputGuideMessage();
        String inputStr = InputView.getNumberInput();
        judge.resetScore();
        judge.setAnswerToJudge(com.getAnswer(), inputStr);
        judge.getScore();
        outputStr = judge.makeResultString();
        System.out.println(outputStr);
    }

    private boolean endGame() {
        OutputView.gameoverMessage();
        String restart = InputView.restartCommandInput();
        if (restart.equals("1")) {
            com.createNumber();
            judge.resetScore();
            return true;
        }
        return false;
    }
}
