package baseball.view;

import camp.nextstep.edu.missionutils.Console;
import baseball.model.InputValidator;

public class InputView {

    public static String getNumberInput() {
        String input = Console.readLine();

        InputValidator valid = new InputValidator(input);
        if (!valid.checkInput()) {
            throw new IllegalArgumentException();
        }
        return input;
    }

    public static String restartCommandInput() {
        String input = Console.readLine();
        if (!InputValidator.validateRestartCommand(input)) {
            throw new IllegalArgumentException();
        }
        return input;
    }
}
