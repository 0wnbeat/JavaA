import org.junit.Assert;
import org.junit.Test;
import Task4_CalculatorHelpers.OperationAddition;
import Task4_CalculatorHelpers.OperationSubtraction;
import Task4_CalculatorHelpers.OperationMultiplication;
import Task4_CalculatorHelpers.OperationDivision;



public class Task7_UnitTestsForCalculator {

    @Test
    public void operationAddition() {
        double calculate = new OperationAddition().calculate(1.0, 2.0);
        Assert.assertEquals("1 + 2 != 3",3, calculate, 0);
    }

    @Test
    public  void operationSubtraction() {
        double calculate = new OperationSubtraction().calculate(1.0, 3.0);
        Assert.assertEquals("1 - 3 != -2",-2, calculate, 0);
    }

    @Test
    public  void operationMultiplication() {
        double calculate = new OperationMultiplication().calculate(2.0, 3.0);
        Assert.assertEquals("2 * 3 != 6",6, calculate, 0);
    }

    @Test
    public  void operationDivision() {
        double calculate = new OperationDivision().calculate(6.0, 3.0);
        Assert.assertEquals("6 / 3 != 2",2, calculate, 0);
    }



}
