package uconverter;

/**
 * Created by Vadims on 25-Apr-17.
 */
public class m_sUnitConverter extends UnitConverter {

    @Override
    public double toSI(double value) {
        return value;
    }

    @Override
    public double fromSI(double siValue) {
        return siValue;
    }

    @Override
    public String getMeasure() {
        return "m/s";
    }

}
