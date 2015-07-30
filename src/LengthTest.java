

import static org.junit.Assert.*;

public class LengthTest {

    @org.junit.Test
    public void testEqualTo() throws Exception {
        Length inch=new Inch(36);
        Length yard=new Yard(1);
        Length feet=new Foot(1);
        Length meter=new Meter(2.54);
        Length cm=new CentiMeter(30.48);
      assertEquals(feet,cm);
    }

}