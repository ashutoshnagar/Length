public class Meter extends Length {
    public final int MtoMM = 100 * 10;

    public Meter() {
        this.conversionFactor = MtoMM;
    }


    public Meter(double value) {
        this.conversionFactor = MtoMM;
        this.value = convertToBaseUnit(value);
    }

}
