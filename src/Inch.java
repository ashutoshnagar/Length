public class Inch extends Length {
    public static final double InchToMM=2.54*10;

    @Override
    public double getValue() {

        return convertFromMM(value);
    }

    public Inch() {
        this.conversionFactor=InchToMM;
    }

    public Inch(double value)
    {
        this.conversionFactor=InchToMM;
        this.value=convertInMM(value);
    }

}
