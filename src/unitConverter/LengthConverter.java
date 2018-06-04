package unitConverter;

public class LengthConverter{

    static double MM_TO_METER = 0.001;
    static double CM_TO_METER = 0.01;
    static double INCH_TO_METER = 0.0254;
    static double DM_TO_METER = 0.1;
    static double FOOT_TO_METER = 0.3048;
    static double YD_TO_METER = 0.9144;
    static double METER = 1;
    static double KM_TO_METER = 1000;
    static double MILE_TO_METER = 1609.344;

    private double factor;

    /**
     * Constructs a unit converter to convert between a unit and meters
     * @param unit
     * the unit used by this converter
     */
     public LengthConverter(String unit){
         switch(unit) {
             case "mm":
                 factor = MM_TO_METER;
                 break;
             case "cm":
                 factor = CM_TO_METER;
                 break;
             case "in":
                 factor = INCH_TO_METER;
                 break;
             case "dm":
                 factor = DM_TO_METER;
                 break;
             case "ft":
                 factor = FOOT_TO_METER;
                 break;
             case "yd":
                 factor = YD_TO_METER;
                 break;
             case "m":
                 factor = METER;
                 break;
             case "km":
                 factor = KM_TO_METER;
                 break;
             case "mi":
                 factor = MILE_TO_METER;
                 break;
         }
     }

    /**
     * Converts a measurment to meters.
     * @param measurment
     * a measurment in the units of this converter
     * @return the equivalent of meters
     */
    public double toMeters(double measurment){
        return (measurment * factor);
    }

    /**
     * Converts a measurment from meters.
     * @param measurment
     * the measurment to convert from meters
     * @return the equivalent value in the unit of this converter
     */
    public double fromMeters(double measurment){
        return (measurment / factor);
    }



}
