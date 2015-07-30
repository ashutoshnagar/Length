public abstract class Unit {
    double value;
    double conversionFactor;
    public abstract double getValue() ;

    @Override
    public boolean equals(Object o) {

        Unit unit=(Unit)o;
        double change=value-unit.value;

        if(  change<=0.0001&&change>=-0.0001)
            return true;
        return false;
    }


    public double convertToBaseUnit() {
        return value;
    }

    public double convertToBaseUnit(double value) {
        return value*conversionFactor;
    }

    public  double convertFromBaseUnit(double value) {
        return value/conversionFactor;
    }
}
