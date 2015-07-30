public class Foot extends Length {
    public static double FoottoMM=12*2.54*10;

    public Foot() {
        this.conversionFactor=FoottoMM;
    }

    @Override
    public double getValue() {
        return convertFromMM(value);
    }

    public Foot(double value)
    {
        this.conversionFactor=FoottoMM;
        this.value=convertInMM(value);
    }
/*
    @Override
    public double convertInMM(double value) {
        return value*FoottoMM;
    }

    @Override
    public double convertFromMM(double value) {
        return value/FoottoMM;
    }
*/
}
