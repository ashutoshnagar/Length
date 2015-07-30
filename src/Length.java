public abstract class Length  {
    double value;
    double conversionFactor;
    public abstract double getValue() ;


    @Override
    public boolean equals(Object o)
    {
        Length length=(Length)o;
        length.value= Math.round(length.value  * 100.0 ) / 100.0;
       // System.out.println(length.value);
        return value== length.value;


    }

    public double convertInMM() {
        return value;
    }

    public double convertInMM(double value) {
        return value*conversionFactor;
    }

    public  double convertFromMM(double value) {
        return value/conversionFactor;
    }
}
