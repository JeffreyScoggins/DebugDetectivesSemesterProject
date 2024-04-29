package swe6673.debugdetectives.sprint1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TemperatureConverterTest {
    @Test
    public void convertCelsiusToFahrenheit1(){
        //purpose: test Celsius to Fahrenheit at boundary point of 32.0 C
        TemperatureConverter convert = new TemperatureConverter();
        double expected = 89.6;
        double actual = convert.celsiusToFahrenheit(32.0);
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void convertCelsiusToFahrenheit2(){
        //purpose: test Celsius to Fahrenheit at boundary point of 0.0 C
        TemperatureConverter convert = new TemperatureConverter();
        double expected = 32.0;
        double actual = convert.celsiusToFahrenheit(0.0);
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void convertCelsiusToFahrenheit3(){
        //purpose: test Celsius to Fahrenheit at boundary point of 100.0 C (maximum)
        TemperatureConverter convert = new TemperatureConverter();
        double expected = 212.0;
        double actual = convert.celsiusToFahrenheit(100.0);
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void convertCelsiusToFahrenheit4(){
        //purpose: test Celsius to Fahrenheit at boundary point of -273.15C (absolute zero)
        TemperatureConverter convert = new TemperatureConverter();
        double expected = -459.67;
        double actual = convert.celsiusToFahrenheit(-273.15);
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void convertCelsiusToKelvin1(){
        //purpose: test Celsius to Kelvin at boundary point of -273.15C (absolute zero)
        TemperatureConverter convert = new TemperatureConverter();
        double expected = 0;
        double actual = convert.celsiusToKelvin(-273.15);
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void convertCelsiusToKelvin2(){
        //purpose: test Celsius to Kelvin at boundary point of 100.0C (maximum)
        TemperatureConverter convert = new TemperatureConverter();
        double expected = 373.15;
        double actual = convert.celsiusToKelvin(100.0);
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void convertCelsiusToKelvin3(){
        //purpose: test Celsius to Kelvin at boundary point of 0.0C
        TemperatureConverter convert = new TemperatureConverter();
        double expected = 273.15;
        double actual = convert.celsiusToKelvin(0.0);
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void convertFahrenheitToCelsius1(){
        //purpose: test Fahrenheit to Celsius at boundary point of -459.67F (absolute zero)
        TemperatureConverter convert = new TemperatureConverter();
        double expected = -273.15;
        double actual = convert.fahrenheitToCelsius(-459.67);
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void convertFahrenheitToCelsius2(){
        //purpose: test Fahrenheit to Celsius at boundary point of 0.0
        TemperatureConverter convert = new TemperatureConverter();
        double expected = -17.7778;
        double actual = convert.fahrenheitToCelsius(0.0);
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void convertFahrenheitToCelsius3(){
        //purpose: test Fahrenheit to Celsius at boundary point of 212.0 (boiling point)
        TemperatureConverter convert = new TemperatureConverter();
        double expected = 100.0;
        double actual = convert.fahrenheitToCelsius(212.0);
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void convertFahrenheitToKelvin1(){
        //purpose: test Fahrenheit to Kelvin at boundary point of -459.67F (absolute zero)
        TemperatureConverter convert = new TemperatureConverter();
        double expected = 0.0;
        double actual = convert.fahrenheitToKelvin(-459.67);
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void convertFahrenheitToKelvin2(){
        //purpose: test Fahrenheit to Kelvin at boundary point of 0.0F
        TemperatureConverter convert = new TemperatureConverter();
        double expected = 255.372;
        double actual = convert.fahrenheitToKelvin(0.0);
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void convertFahrenheitToKelvin3(){
        //purpose: test Fahrenheit to Kelvin at boundary point of 32F
        TemperatureConverter convert = new TemperatureConverter();
        double expected = 273.15;
        double actual = convert.fahrenheitToKelvin(32.0);
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void convertKelvinToCelsius1(){
        //purpose: test Kelvin to Celsius with boundary point of 373.15K (boiling point)
        TemperatureConverter convert = new TemperatureConverter();
        double expected = 100.0;
        double actual = convert.kelvinToCelsius(373.15);
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void convertKelvinToCelsius2(){
        //purpose: test Kelvin to Celsius with boundary point of 0K (absolute zero)
        TemperatureConverter convert = new TemperatureConverter();
        double expected = -273.15;
        double actual = convert.kelvinToCelsius(0.0);
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void convertKelvinToFahrenheit1(){
        //purpose: test Kelvin to Fahrenheit with boundary point of 0K (absolute zero)
        TemperatureConverter convert = new TemperatureConverter();
        double expected = -273.15;
        double actual = convert.kelvinToCelsius(0.0);
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void convertKelvinToFahrenheit2(){
        //purpose: test Kelvin to Fahrenheit with boundary point of 373.15K (boiling point)
        TemperatureConverter convert = new TemperatureConverter();
        double expected = 100.0;
        double actual = convert.kelvinToCelsius(373.15);
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }
    @Test
    public void testBoundaryPositive(){
        //purpose: test Celsius to Fahrenheit at boundary point of value just above zero
        TemperatureConverter convert = new TemperatureConverter();
        double expected = 32.018;
        double actual = convert.celsiusToFahrenheit(0.01);
        assertEquals("Error, test results are different than expected", expected, actual, 0.0003);
    }


}
