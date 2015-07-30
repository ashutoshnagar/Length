public class Cup extends Volume {
    public double conservionFactorToTeaSpoon = 8.0 * 2.0 * 3.0;

    public Cup() {
        this.conversionFactor = conservionFactorToTeaSpoon;
    }

    public Cup(double value) {
        this.conversionFactor = conservionFactorToTeaSpoon;
        this.value = convertToBaseUnit(value);
    }

    public Cup add(Volume volume) {
        return new Cup(addToVolume(volume));
    }

}
