public class TeaSpoon extends Volume {
    public double conservionFactorToTeaSpoon=1.0;
    public TeaSpoon(){
        this.conversionFactor=conservionFactorToTeaSpoon;
    }
    public TeaSpoon(double value){
        this.conversionFactor=conservionFactorToTeaSpoon;
        value=convertToBaseUnit(value);
        this.value=value;
    }

    @Override
    public double getValue() {
        return convertFromBaseUnit(value);
    }


}
