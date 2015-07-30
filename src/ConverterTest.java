import org.junit.Test;
import static org.junit.Assert.*;

public class ConverterTest {

    @Test
    public void testConvertToInch() throws Exception {

        Length foot=new Foot(1);
        Length meter=new Meter(2.54);
        Length cm=new CentiMeter(2.54);
        Length yard=new Yard(1);

/*
        assertEquals(new Inch(1), ConverterToUnit.convertToInch(cm));
        assertEquals(new Inch(36), ConverterToUnit.convertToInch(yard));
        assertEquals(new Inch(100), ConverterToUnit.convertToInch(meter));
*/


        Length inch=Converter.convertToInch(foot);
        System.out.println(inch.getValue());

        assertEquals(new Inch(12), inch);




    }

    @Test
    public void testConvertToMeter() throws Exception {
        Length cm=new CentiMeter(100);
        Length inch=new Inch(100);
        assertEquals(new Meter(1),Converter.convertToMeter(cm));
        assertEquals(new Meter(2.54),Converter.convertToMeter(inch));

    }

    @Test
    public void testConvertToCentiMeter() throws Exception {
        Length inch=new Inch(1);
        Length meter=new Meter(254);
        Length foot=new Foot(1);
        assertEquals(new CentiMeter(2.54),Converter.convertToCentiMeter(inch));
        assertEquals(new CentiMeter(25400),Converter.convertToCentiMeter(meter));
        assertEquals(new CentiMeter(30.48),Converter.convertToCentiMeter(foot));

    }


}