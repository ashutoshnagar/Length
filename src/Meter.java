public class Meter extends Length{
    public final int MtoMM=100*10;
    @Override
    public double getValue(){
        return convertFromMM(value);
    }
    public Meter(double value)
    {
        this.value=convertInMM(value);
    }

    @Override
    public double convertInMM(double value) {
        return value*MtoMM;
    }

    @Override
    public double convertFromMM(double value) {
        return value/MtoMM;
    }
}
