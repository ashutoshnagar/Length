public class Converter {

    public static Inch convertToInch(Length object) {
        Length inch = new Inch();
        double value = object.convertToBaseUnit();
        return new Inch(inch.convertFromBaseUnit(value));
    }

    public static Meter convertToMeter(Length object) {
        Length meter = new Meter();
        double value = object.convertToBaseUnit();
        return new Meter(meter.convertFromBaseUnit(value));
    }

    public static CentiMeter convertToCentiMeter(Length object) {
        Length centiMeter = new CentiMeter();
        double value = object.convertToBaseUnit();

        return new CentiMeter(centiMeter.convertFromBaseUnit(value));
    }

    public static Yard convertYard(Length object) {
        Length yard = new Yard();
        double value = object.convertToBaseUnit();
        return new Yard(yard.convertFromBaseUnit(value));
    }

    public static Foot convertToFeet(Length object) {
        Length foot = new Foot();
        double value = object.convertToBaseUnit();
        return new Foot(foot.convertFromBaseUnit(value));
    }

    public static Cup convertToCup(Volume object) {
        Volume volume = new Cup();
        double value = object.convertToBaseUnit();
        return new Cup(volume.convertFromBaseUnit(value));
    }

    public static Ounce convertToOunce(Volume object) {
        Volume volume = new Ounce();
        double value = object.convertToBaseUnit();
        return new Ounce(volume.convertFromBaseUnit(value));
    }

    public static TableSpoon convertToTableSpoon(Volume object) {
        Volume volume = new TableSpoon();
        double value = object.convertToBaseUnit();
        return new TableSpoon(volume.convertFromBaseUnit(value));
    }

    public static TeaSpoon convertToTeaSpoon(Volume object) {
        return new TeaSpoon(object.convertToBaseUnit());
    }

    public static Celcius convertToCelcius(Temperature temperature){

        Temperature temperature1=new Celcius();
        double value = temperature.convertToBaseUnit();

        return new Celcius(temperature1.convertFromBaseUnit(value));

    }


    public static Fahrenheit convertToFahrenheit(Temperature temperature){

       return new Fahrenheit(temperature.convertToBaseUnit());
    }
}
