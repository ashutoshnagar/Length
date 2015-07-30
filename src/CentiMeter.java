public class CentiMeter extends Length {
    public static final int CMtoMM = 10;

    public CentiMeter() {
        this.conversionFactor = CMtoMM;
    }

    public CentiMeter(double value) {
        this.conversionFactor = CMtoMM;
        this.value = convertToBaseUnit(value);

        }

    public Length add(Length object) {
        return new CentiMeter(addLength(object));
    }
}
