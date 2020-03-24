package Testcases;

import Calculator.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SumTest extends Calculator {
    int firstNum = 12;
    int secondNum = 7;

    @Test

    public void sumPositiveTest() {
        int expectedResult = 19;
        Assert.assertEquals(super.sum(firstNum, secondNum), expectedResult);
    }

    @Test

    public void sumFailTest() {
        int expectedResult = 10;
        Assert.assertEquals(super.sum(firstNum, secondNum), expectedResult);
    }
}
