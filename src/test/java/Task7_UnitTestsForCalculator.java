import org.junit.Assert;
import org.junit.Test;
import Task4_CalculatorOperations.OperationAddition;


public class Task7_UnitTestsForCalculator {

    @Test
    public void operation() {
        double calculate = new OperationAddition().calculate(1.0, 2.0);
        Assert.assertEquals("1 + 2 != 3",3, calculate, 0);
    }

}
