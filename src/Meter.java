public class Meter extends Length{
    public final int MtoMM=100*10;

    public Meter() {
        this.conversionFactor=MtoMM;
    }

    @Override
    public double getValue(){
        return convertFromMM(value);
    }
    public Meter(double value)
    {
        this.conversionFactor=MtoMM;
        this.value=convertInMM(value);
    }


}
