public class CentiMeter extends  Length  {
    public static final int CMtoMM=10;

    public CentiMeter() {
        this.conversionFactor=CMtoMM;
    }

    @Override
    public double getValue(){

        return convertFromMM(value);
    }
     public CentiMeter(double value)
     {
         this.conversionFactor=CMtoMM;
         this.value=convertInMM(value);
     }
/*

    @Override
    public double convertInMM(double value) {
        return value*CMtoMM;
    }

    @Override
    public double convertFromMM(double value) {

        return value/CMtoMM;
    }
*/
}
