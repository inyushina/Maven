package Testcases;

import Calculator.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MultiplyTest extends Calculator {
    int firstNum = 12;
    int secondNum = 2;

    @Test

    public void multiplyPositiveTest() {
        int expectedResult = 24;
        Assert.assertEquals(super.mult(firstNum, secondNum), expectedResult);

    }

    @Test

    public void multiplyFailTest() {
        int expectedResult = 8;
        Assert.assertEquals(super.mult(firstNum, secondNum), expectedResult);

    }

}
