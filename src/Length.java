public abstract class Length  {
    double value;
    double conversionFactor;
    public abstract double getValue() ;

    @Override
    public boolean equals(Object o) {

        Length length = (Length) o;
        double change=value-length.value;

        if(  change<=0.0001&&change>=-0.0001)
            return true;
        return false;
    }



    public double convertToBaseUnit() {
        return value;
    }

    public double convertToBaseUnit(double value) {
        //System.out.println(value*conversionFactor);
      //  System.out.println(value);
        return value*conversionFactor;
    }

    public  double convertFromBaseUnit(double value) {
      //  System.out.println(value/conversionFactor);
        return value/conversionFactor;
    }
}
