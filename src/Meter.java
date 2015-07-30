public class Meter extends Length {
    public final int MtoMM = 100 * 10;

    public Meter() {
        this.conversionFactor = MtoMM;
    }

    @Override
    public double getValue() {
        return convertFromBaseUnit(value);
    }

    public Meter(double value) {
        this.conversionFactor = MtoMM;
        this.value = convertToBaseUnit(value);
    }

    public Meter add(Length object) {
        return new Meter(addLength(object));
    }
}
