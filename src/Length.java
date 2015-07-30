
public abstract class Length extends Unit {

    public double addLength(Length length) {
        return (value + length.value) / conversionFactor;

    }
}
