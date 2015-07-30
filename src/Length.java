public abstract class Length implements Converter {
    double value;

    public abstract double getValue() ;

    @Override
    public boolean equals(Object o)
    {
        Length length=(Length)o;
        return value== length.value;

    }
}
