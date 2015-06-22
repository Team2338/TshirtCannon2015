package team.gif;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    //PWM
    public static final int leftMotor = 1;
    public static final int rightMotor = 2;
    public static final int reloadMotor = 3;
    public static final int angleMotor = 4;
    
    //DIO
    public static final int readySensor = 1;
    
    //Solenoid
    public static final int shootTop = 0;
    public static final int shootBottom = 1;
    public static final int lockA = 2;
    public static final int lockB = 3;
}
