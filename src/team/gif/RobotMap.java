package team.gif;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    //PWM
    public static final int leftMotor = 3;
    public static final int rightMotor = 1;
    public static final int angleMotor = 2;
    
    //DIO
    public static final int minAngle = 4;
    public static final int maxAngle = 5;
    public static final int barrel1 = 7;
    public static final int barrel2 = 8;
    public static final int barrel3 = 9;
}
