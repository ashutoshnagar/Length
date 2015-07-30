public class Cup extends  Volume {
    public double conservionFactorToTeaSpoon=8.0*2.0*3.0;
    public Cup(){
        this.conversionFactor=conservionFactorToTeaSpoon;
    }
    public Cup(double value){
        this.conversionFactor=conservionFactorToTeaSpoon;
        this.value=convertToBaseUnit(value);
    }
    @Override
    public double getValue() {
        return convertFromBaseUnit(value);
    }
}
