public class Yard extends  Length {
    public static final double YardtoMM=3*12*2.54*10;

    public Yard() {
        this.conversionFactor=YardtoMM;
    }

    @Override
    public double getValue() {
        return convertFromMM(value);
    }

    public Yard(double value)
    {
        this.conversionFactor=YardtoMM;
        this.value=convertInMM(value);
    }
}

