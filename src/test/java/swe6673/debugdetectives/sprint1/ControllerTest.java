package swe6673.debugdetectives.sprint1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Before.*;

public class ControllerTest {

    @Test
    public void checkNumberLengthFalse() throws Exception {
        Controller numberLength = new Controller();
        //purpose to ensure that maximum number of digits cannot be exceeded
        boolean actual = numberLength.checkNumberLength(10000000000.0); //10,000,000,000 eleven digits
        boolean expected = false;
        assertEquals("Error, test results are different than expected", expected, actual);
    }
    @Test
    public void checkNumberLengthTrue() throws Exception {
        Controller numberLength = new Controller();
        //purpose to ensure that maximum number of digits cannot be exceeded
        boolean actual = numberLength.checkNumberLength(100000000.0); //10,000,000,000 eleven digits
        boolean expected = true;
        assertEquals("Error, test results are different than expected", expected, actual);
    }

    @Test
    public void checkDecimalLengthFalse() throws Exception {
        Controller numberLength = new Controller();
        //purpose to ensure that maximum number of digits cannot be exceeded
        boolean actual = numberLength.checkNumberLength(0.0000000008); // ten decimals and one whole number
        boolean expected = false;
        assertEquals("Error, test results are different than expected", expected, actual);
    }

    @Test
    public void checkDecimalLengthTrue() throws Exception {
        Controller numberLength = new Controller();
        //purpose to ensure that maximum number of digits cannot be exceeded
        boolean actual = numberLength.checkNumberLength(9.000000008); // ten decimals and one whole number
        boolean expected = true;
        assertEquals("Error, test results are different than expected", expected, actual);
    }

    @Test
    public void covertIntToDoublePositive() throws Exception {
        //purpose to check to see if Intergers can be converted to Doubles if needed
        Controller number = new Controller();
        double actual = number.convertIntToDouble(36);
        double expected = 36.0;
        assertEquals("Error, test results are different than expected", expected, actual);
    }

    @Test
    public void covertIntToDoubleNegative() throws Exception {
        //purpose to check to see if Intergers can be converted to Doubles if needed
        Controller number = new Controller();
        double actual = number.convertIntToDouble(-23);
        double expected = -23.0;
        assertEquals("Error, test results are different than expected", expected, actual);
    }

    @Test
    public void covertIntToDouble() throws Exception {
        //purpose to check to see if Intergers can be converted to Doubles if needed
        Controller number = new Controller();
        double actual = number.convertIntToDouble(10);
        int expected = 10;
        assertNotEquals("Error, test results are different than expected", expected, actual);
    }

    @Test
    public void clearScreen() throws Exception {
        //purpose to check to see if screen can be cleared
        Controller clear = new Controller();
        String actual = clear.onScreenText;
        String expected = "";
        assertEquals("Error, test results are different than expected", expected, actual);
    }

    @Test
    public void convertDoubleToString() throws Exception {
        //purpose to check to ensure doubles are converted to string
        Controller dub = new Controller();
        String actual = dub.convertNumToString(44.0);
        String expected = "44";
        assertEquals("Error, test results are different than expected", expected, actual);
    }

    @Test
    public void convertIntToString() throws Exception {
        //purpose to check to ensure doubles are converted to string
        Controller int_ = new Controller();
        String actual = int_.convertNumToString(44);
        String expected = "44";
        assertEquals("Error, test results are different than expected", expected, actual);
    }

    @Test
    public void storeInput() throws Exception {
        //purpose to ensure that on screen text is being properly stored once a modifier key is pressed
        Controller num = new Controller();
        num.setEquation("630*3+99");
        String actual = num.currentEquation;
        String expected = "630*3+99";
        assertEquals("Error, test results are different than expected", expected, actual);
    }

    @Test
    public void equalsButton() throws Exception {
        //purpose: to ensure that the correct equation was sent for processing
        Controller equation = new Controller();
        equation.equals("4 x 3 + 8");
        String actual = equation.currentInput;
        String expected = "4 x 3 + 8";
        assertEquals("Error, test results are different than expected", expected, actual);
    }

    @Test
    public void Parenthesis() throws Exception {
        //purpose: to ensure that the program calculates equations with parenthesis accurately
        Controller equation = new Controller();
        equation.equals("(3 + 2) * (6 - 4)");
        String actual = equation.onScreenText;
        String expected = "10";
        assertEquals("Error, test results are different than expected", expected, actual);
    }

    @Test
    public void PEDMAS() throws Exception {
        //purpose to test to ensure that the calculator follows the PEDMAS mathmatic rule
        Controller equation = new Controller();
        equation.equals("2 + 5 - 3 * 8"); //-14 w/ pedmas 24 w/o pedmas
        String actual = equation.onScreenText;
        String expected = "14";
    }

    @Test
    public void shortenDecimalWithRound() throws Exception {
        //purpose to ensure that number is shorter than max number of characters on screen and rounds up if 11th number =>5
        Controller num = new Controller();
        Double actual = num.shortenDecimal(38.123456789);
        Double expected = 38.12345679;
        assertEquals("Error, test results are different than expected", expected, actual);
    }

    @Test
    public void shortenDecimalNoRound() throws Exception {
        //purpose to ensure that number is shorter than max number of characters on screen and does not rounds up if 11th number < 5
        Controller num = new Controller();
        Double actual = num.shortenDecimal(38.123456781);
        Double expected = 38.12345678;
        assertEquals("Error, test results are different than expected", expected, actual);
    }

    @Test
    public void shortenLong() throws Exception {
        //purpose to ensure that number is shorter than max number of characters on screen and rounds up if 11th number =>5
        Controller num = new Controller();
        String actual = num.shortenLong(90876543219999.0);
        String expected = "9.08 x 10^14";
        assertEquals("Error, test results are different than expected", expected, actual);
    }

    @Test
    public void divideByZero() throws Exception {
        //purpose: To ensure that an error is thrown if user attempts to divide by zero
        Controller num = new Controller();
        num.divideByZero("3/0");
        String actual = num.onScreenText;
        String expected = "ERROR";
        assertEquals("Error, test results are different than expected", expected, actual);
    }

    @Test
    public void degreeModeTest() throws Exception{
        //purpose: to ensure that degrees are used during calulation of trig functions
        Controller deg = new Controller();
        deg.degreeMode(true);
        deg.setEquation("sin(60)");
        String actual = deg.onScreenText;
        Double expected = 0.8660254;
        assertEquals("Error, test results are different than expected", expected, actual);

    }

    @Test
    public void radianModeTest() throws Exception{
        //purpose: to ensure that degrees are used during calulation of trig functions
        Controller deg = new Controller();
        deg.radianMode(true);
        deg.setEquation("sin(0.5)");
        String actual = deg.onScreenText;
        Double expected = 0.4794255386;
        assertEquals("Error, test results are different than expected", expected, actual);

    }

    @Test
    public void gradianModeTest() throws Exception{
        //purpose: to ensure that degrees are used during calulation of trig functions
        Controller deg = new Controller();
        deg.gradianMode(true);
        deg.setEquation("sin(100)");
        String actual = deg.onScreenText;
        Double expected = 0.4794255386;
        assertEquals("Error, test results are different than expected", expected, actual);

    }

}
