public class CentiMeter extends  Length  {
    public static final int CMtoMM=10;

    public CentiMeter() {
        this.conversionFactor=CMtoMM;
    }

    @Override
    public double getValue(){

        return convertFromBaseUnit(value);
    }
     public CentiMeter(double value)
     {
         this.conversionFactor=CMtoMM;
         this.value= convertToBaseUnit(value);
     }

}
