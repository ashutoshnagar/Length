public class Yard extends  Length {
    public static final double YardtoMM=3*12*2.54*10;

    @Override
    public double getValue() {
        return convertFromMM(value);
    }

    public Yard(double value)
    {
        this.value=convertInMM(value);
    }
    @Override
    public double convertInMM(double value) {
        return value*YardtoMM;
    }

    @Override
    public double convertFromMM(double value) {
        return value/YardtoMM;
    }
}
