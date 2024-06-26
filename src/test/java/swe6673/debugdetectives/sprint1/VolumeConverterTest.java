package swe6673.debugdetectives.sprint1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class VolumeConverterTest {
    @Test
    public void convertUSGallonToImperialGallon(){
        //purpose: test US gallon to Imperial gallon
        VolumeConverter convert = new VolumeConverter();
        double expected = 83.2674;
        double actual = convert.convertFrom(100.0, "USGallon", "ImperialGallon");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void convertUSGallonToUSQuart(){
        //purpose: test US gallon to US quart with boundary point of 1.0
        VolumeConverter convert = new VolumeConverter();
        double expected = 4.0;
        double actual = convert.convertFrom(1.0, "USGallon", "USQuart");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void convertUSTablespoonToImperialCup(){
        //purpose: test US tablespoon to Imperial Cup with boundary point of value just above zero
        VolumeConverter convert = new VolumeConverter();
        double expected = 0.0005204214;
        double actual = convert.convertFrom(0.01, "USTablespoon", "ImperialCup");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void convertLiterToImperialOunce(){
        //purpose: test US tablespoon to Imperial Cup with boundary point of 99.9
        VolumeConverter convert = new VolumeConverter();
        double expected = 3515.988;
        double actual = convert.convertFrom(99.9, "liter", "ImperialOunce");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void convertMilliliterToUSTeaspoon(){
        //purpose: test milliliter to US teaspoon
        VolumeConverter convert = new VolumeConverter();
        double expected = 0.318081852;
        double actual = convert.convertFrom(1.5678, "milliliter", "USTeaspoon");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void convertUSPintToImperialPint(){
        //purpose: test US pint to imperial pint --same unit in two systems
        VolumeConverter convert = new VolumeConverter();
        double expected = 8.32674;
        double actual = convert.convertFrom(10.0, "USPint", "ImperialPint");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void convertUSTablespoonToUSTeaspoon(){
        //purpose: test US tablespoon to US teaspoon --two units in same system
        VolumeConverter convert = new VolumeConverter();
        double expected = 36.60001;
        double actual = convert.convertFrom(12.20, "USTableSpoon", "USTeaspoon");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void convertCubicFootToCubicInch(){
        //purpose: test cubic foot to cubic inch with boundary point of 100.01
        VolumeConverter convert = new VolumeConverter();
        double expected = 172817.117162;
        double actual = convert.convertFrom(100.01, "CubicFoot", "CubicInch");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void convertSameUnit(){
        //purpose: test conversion with same unit and boundary point of value  just below zero
        VolumeConverter convert = new VolumeConverter();
        double expected = -0.01;
        double actual = convert.convertFrom(-0.01, "ImperialOunce", "ImperialOunce");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void testFalsePositive(){
        //purpose: test volume converter does not return false positive
        VolumeConverter convert = new VolumeConverter();
        double expected = 0.0;
        double actual = convert.convertFrom(10, "Liter", "ImperialOunce");
        assertNotEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void testNegativeInput(){
        //purpose: test volume converter with negative input
        VolumeConverter convert = new VolumeConverter();
        double expected = -45460.9;
        double actual = convert.convertFrom(-10.0, "ImperialGallon", "Milliliter");
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }

}
