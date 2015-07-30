import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConverterTest {


    @Test
    public void testConvertToInch() throws Exception {

        assertEquals(new Inch(1), Converter.convertToInch(new CentiMeter(2.54)));
        assertEquals(new Inch(36), Converter.convertToInch(new Yard(1)));
        assertEquals(new Inch(100), Converter.convertToInch(new Meter(2.54)));
        assertEquals(new Inch(12), Converter.convertToInch(new Foot(1)));

    }


    @Test
    public void testConvertToMeter() throws Exception {
        Length cm = new CentiMeter(100);
        Length inch = new Inch(100);
        assertEquals(new Meter(1), Converter.convertToMeter(cm));
        assertEquals(new Meter(2.54), Converter.convertToMeter(inch));

    }

    @Test
    public void testConvertToCentiMeter() throws Exception {
        Length inch = new Inch(1);
        Length meter = new Meter(254);
        Length foot = new Foot(1);
        assertEquals(new CentiMeter(2.54), Converter.convertToCentiMeter(inch));
        assertEquals(new CentiMeter(25400), Converter.convertToCentiMeter(meter));
        assertEquals(new CentiMeter(30.48), Converter.convertToCentiMeter(foot));

    }


    @Test
    public void testConvertToCup() throws Exception {
        assertEquals(new Cup(1), Converter.convertToCup(new TeaSpoon(48)));
    }

    @Test
    public void testConvertToOunce() throws Exception {
        assertEquals(new Ounce(2), Converter.convertToOunce(new TeaSpoon(12)));
    }

    @Test
    public void testConvertToTableSpoon() throws Exception {
        /*System.out.println(new Cup(1).convertToBaseUnit());
        System.out.println(new TableSpoon().convertToBaseUnit());
        */
        assertEquals(new TableSpoon(16), Converter.convertToTableSpoon(new Cup(1)));

    }

    @Test
    public void testConvertToTeaSpoon() throws Exception {

        assertEquals(new TeaSpoon(12), Converter.convertToTeaSpoon(new Ounce(2)));

    }

    @Test
    public void testAdd() throws Exception {
        assertEquals(new Inch(16), new Inch(6).add(new CentiMeter(25.4)));
    }

    @Test
    public void testConvertToCelcius() throws Exception {
        assertEquals(new Celcius(100),Converter.convertToCelcius(new Fahrenheit(212)));
    }

    @Test
    public void testConvertToFahrenheit() throws Exception {
        assertEquals(new Fahrenheit(32),Converter.convertToFahrenheit(new Celcius(0)));

    }
}