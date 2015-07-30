public class Celcius extends Temperature {
    @Override
    public double convertFromBaseUnit(double value) {

        return (value - 32) / 1.8;
    }

    public Celcius(double value) {
        this.value = convertToBaseUnit(value);
    }

    public Celcius() {
    }

    @Override
    public double convertToBaseUnit(double value) {

        return value * 1.8 + 32;
    }
}
