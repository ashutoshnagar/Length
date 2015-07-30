public class Inch extends Length {
    public static final double InchToMM=2.54*10;

    @Override
    public double getValue() {

        return convertFromMM(value);
    }

    public Inch(double value)
    {
        this.value=convertInMM(value);
    }
    @Override
    public double convertInMM(double value) {
        return value*InchToMM;
    }

    @Override
    public double convertFromMM(double value) {
        return value/InchToMM;
    }
}
