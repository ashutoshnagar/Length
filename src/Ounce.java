public class Ounce extends Volume {
    public double conservionFactorToTeaSpoon = 2.0 * 3.0;

    public Ounce() {
        this.conversionFactor = conservionFactorToTeaSpoon;
    }

    public Ounce(double value) {
        this.conversionFactor = conservionFactorToTeaSpoon;
        this.value = convertToBaseUnit(value);
    }


    public Ounce add(Volume volume) {
        return new Ounce(addToVolume(volume));
    }

}
