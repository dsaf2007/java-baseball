package baseball;

import camp.nextstep.edu.missionutils.Console;

public class InputView {

    public static String getNumberInput(){
        String input = Console.readLine();

        InputValidator valid = new InputValidator(input);
            if (!valid.checkInput()) {
                throw new IllegalArgumentException();
            }
        return input;
    }

    public static String restartCommandInput()
    {
        String input = Console.readLine();
        return input;
    }
    
}
