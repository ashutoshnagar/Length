public class Converter {



    public static Inch convertToInch(Length object)
    {   Length inch=new Inch();
        double value= object.convertInMM();

        //value =value/25.4;
        value=Math.round(value  * 1000.0 ) / 1000.0;
        System.out.println(value);



         return new Inch(inch.convertFromMM(value));
    }
    public static Meter convertToMeter(Length object)
    {
        Length meter=new Meter();
        double value= object.convertInMM();
        return  new Meter(meter.convertFromMM(value));
    }

    public static CentiMeter convertToCentiMeter(Length object)
    {
        Length centiMeter=new CentiMeter();
        double value= object.convertInMM();

        return new CentiMeter(centiMeter.convertFromMM(value));
    }
    public static Yard convertYard(Length object)
    {
        Length yard=new Yard();
        double value= object.convertInMM();
        return new Yard(yard.convertFromMM(value));
    }
    public static Foot convertToFeet(Length object)
    {
        Length foot=new Foot();
        double value= object.convertInMM();
        return new Foot(foot.convertFromMM(value));
    }

}
