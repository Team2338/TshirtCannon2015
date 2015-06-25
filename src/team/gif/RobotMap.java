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
    public static final int minAngle = 1;
    public static final int maxAngle = 2;
    public static final int slowDown = 3;
    public static final int lock = 4;
    public static final int leftEnd = 5;
    public static final int rightEnd = 6;
    
    //Solenoid
    public static final int barrel1 = 0;
    public static final int barrel2 = 1;
    public static final int barrel3 = 2;
}
