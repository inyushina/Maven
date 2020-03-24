package Testcases;

import Calculator.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DivisionTest extends Calculator {
    int firstNum = 24;
    int secondNum = 8;

    @Test

    public void divisionPositiveTest() {
        int expectedResult = 3;
        Assert.assertEquals(super.div(firstNum, secondNum), expectedResult);

    }

    @Test

    public void divisionNegativeTest() {
        int expextedResult = 2;
        Assert.assertEquals(super.div(firstNum, secondNum), expextedResult);

    }
}
