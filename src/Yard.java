public class Yard extends  Length {
    public static final double YardtoMM=3*12*2.54*10;

    public Yard() {
        this.conversionFactor=YardtoMM;
    }

    public Yard(double value)
    {
        this.conversionFactor=YardtoMM;
        this.value= convertToBaseUnit(value);
    }

    public Yard add(Length object)
    {
        return new Yard(addLength(object));
    }
}

