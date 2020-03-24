package Testcases;

import Calculator.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AdjustmentTest extends Calculator {
    int firstNum = 33;
    int secondNum = 13;

    @Test
    public void adjustmentPositiveTest() {
        int expectedResult = 20;
        Assert.assertEquals(super.adj(firstNum, secondNum), expectedResult);

    }

    @Test

    public void adjustmentNegativeTest() {
        int expectedResult = 21;
        Assert.assertEquals(super.adj(firstNum, secondNum), expectedResult);

    }

}
