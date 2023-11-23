
public class Main {
    public static void main(String[] args) {
        // Create an instance of the AirPurifier class
        AirPurifier purifier = new AirPurifier("Model123", "SN456");
        AirPurifier purifier1 = new AirPurifier("Model1234", "SN4567");

        // Call the OnOff method to toggle the power status
        purifier.Onoff();
        purifier.Onoff();
        purifier.speedwind();
        purifier.speedwind();
        purifier.speedwind();
        purifier.speedwind();
        purifier.settime();
        purifier.settime();
        purifier.settime();
        purifier.settime();
        purifier.settime();
        purifier.settime();
        purifier.settime();
        purifier.mode();
        purifier.mode();
        purifier.mode();
        purifier.Onoff();
        AirPurifier.checkstock();

    }
}
