import Task4_CalculatorHelpers.*;
import org.junit.Assert;
import org.junit.Test;


public class Task7_UnitTestsForCalculatorParser {

    @Test()
    public void expectedInput() {
        String input = "1 + 2";
        try {
            ParsedInput parsedInput = InputParser.parse(input);
            double left = parsedInput.getLeft();
            double right = parsedInput.getRight();
            String operation = parsedInput.getOperation();

            Assert.assertEquals(1, left, 0);
            Assert.assertEquals(2, right, 0);
            Assert.assertEquals("+", operation);

        } catch (Exception ignored) {
        }

    }

    @Test(expected = Exception.class)
    public void wrongFormatInput() throws Exception {
        String input = "1 + 2 + 3";
        InputParser.parse(input);
    }

    @Test(expected = Exception.class)
    public void wrongLeftOperand() throws Exception {
        String input = "a + 1";
        InputParser.parse(input);
    }

    @Test(expected = Exception.class)
    public void wrongRightOperand() throws Exception {
        String input = "1 - b";
        InputParser.parse(input);
    }

    @Test(expected = Exception.class)
    public void wrongOperator() throws Exception {
        String input = "1 & 1";
        InputParser.parse(input);
    }

    @Test(expected = Exception.class)
    public void divisionByZero() throws Exception {
        String input = "1 / 0";
        InputParser.parse(input);
    }
}
