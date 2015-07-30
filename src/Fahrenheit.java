public class Fahrenheit extends Temperature {
    public Fahrenheit(double value) {
        this.value = value;
    }

    public Fahrenheit() {
    }

    @Override
    public double convertFromBaseUnit(double value) {

        return (value);
    }
}
