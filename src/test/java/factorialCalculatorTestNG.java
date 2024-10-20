import org.testng.Assert;
import org.testng.annotations.Test;

public class factorialCalculatorTestNG {

    @Test
    public void testFactorialPositive() {
        Assert.assertEquals(Factorial.calculate(5), 120);
    }

    @Test
    public void testFactorialZero() {
        Assert.assertEquals(Factorial.calculate(0), 1);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testFactorialNegative() {
        Factorial.calculate(-1);
    }
}
