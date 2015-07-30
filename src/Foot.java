public class Foot extends Length {
    public static double FoottoMM=12*2.54*10;

    public Foot() {
        this.conversionFactor=FoottoMM;
    }

    @Override
    public double getValue() {
        return convertFromBaseUnit(value);
    }

    public Foot(double value)
    {
        this.conversionFactor=FoottoMM;
        this.value= convertToBaseUnit(value);
    }


}
