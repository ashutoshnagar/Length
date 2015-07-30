public class TableSpoon extends Volume {
    public double conservionFactorToTeaSpoon = 3.0;

    public TableSpoon() {
        this.conversionFactor = conservionFactorToTeaSpoon;
    }

    public TableSpoon(double value) {
        this.conversionFactor = conservionFactorToTeaSpoon;
        this.value = convertToBaseUnit(value);
    }


    public TableSpoon add(Volume volume) {
        return new TableSpoon(addToVolume(volume));
    }
}
