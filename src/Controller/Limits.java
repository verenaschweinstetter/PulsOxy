package Controller;

public class Limits {

    private static short upperPulse;
    private static short lowerPulse;
    private static short upperSp02;
    private static short lowerSp02;

    /*
    Return current values of upper and lower pulse and upper and lower SpO2
     */

    public static short getUpperPulse() {
        return upperPulse;
    }

    public static short getLowerPulse() {
        return lowerPulse;
    }

    public static short getUpperSpO2() {
        return upperSp02;
    }

    public static short getLowerSpO2() {
        return lowerSp02;
    }

    /*
    Initialize the limits of upper / lower pulse depending on the age of the user and of the upper / lower SpO2
     */

    public void initializeLimits(int age) {
        if (age >= 18) {
            upperPulse = 80;
            lowerPulse = 60;
        } else {
            upperPulse = 100;
            lowerPulse = 80;
        }
        upperSp02 = 100;
        lowerSp02 = 90;
    }
}
