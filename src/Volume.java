public abstract class Volume extends Unit {

        public double addToVolume(Volume object){
            return (value+object.value)/conversionFactor;
        }
}
